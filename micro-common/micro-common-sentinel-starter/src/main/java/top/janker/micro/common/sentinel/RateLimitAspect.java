package top.janker.micro.common.sentinel;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.util.MethodUtil;
import com.alibaba.csp.sentinel.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.expression.AnnotatedElementKey;
import org.springframework.expression.EvaluationContext;
import org.springframework.stereotype.Component;
import top.janker.micro.common.sentinel.el.RateLimitExpressionEvaluator;

import java.lang.reflect.Method;

/**
 * @author janker
 * @date 2021/12/18
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
@Aspect
@Slf4j
@EnableAspectJAutoProxy
@Component
@ConditionalOnProperty(prefix = "micro",name = "sentinel.enable",havingValue = "true")
public class RateLimitAspect {

    private RateLimitExpressionEvaluator<String> evaluator = new RateLimitExpressionEvaluator<>();

    @Pointcut("@annotation(top.janker.micro.common.sentinel.RateLimit)")
    public void rateLimitAnnotationPointcut() {

    }
    @Around("rateLimitAnnotationPointcut()")
    public Object invokeResourceWithRateLimit(ProceedingJoinPoint pjp) throws Throwable{
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method method = methodSignature.getMethod();
        RateLimit annotation = method.getAnnotation(RateLimit.class);
        if (annotation == null) {
            // Should not go through here.
            throw new IllegalStateException("Wrong state for SentinelResource annotation");
        }
        EvaluationContext evaluationContext = evaluator.createEvaluationContext(pjp.getTarget(), pjp.getTarget().getClass(), ((MethodSignature) pjp.getSignature()).getMethod(), pjp.getArgs());
        AnnotatedElementKey methodKey = new AnnotatedElementKey(((MethodSignature) pjp.getSignature()).getMethod(), pjp.getTarget().getClass());
        String param = evaluator.condition(annotation.param(), methodKey, evaluationContext, String.class);

        String resourceName = getResourceName(annotation.value(), method);
        EntryType entryType = annotation.entryType();
        Entry entry = null;
        try {
            entry = SphU.entry(resourceName, 0, entryType, new Object[]{param});
            Object result = pjp.proceed();
            return result;
        } catch (BlockException ex) {
            //抛出异常
            throw ex;
        } catch (Throwable ex) {

            throw ex;
        } finally {
            if (entry != null) {
                entry.exit(1, pjp.getArgs());
            }
        }
    }

    protected String getResourceName(String resourceName, /*@NonNull*/ Method method) {
        // If resource name is present in annotation, use this value.
        if (StringUtil.isNotBlank(resourceName)) {
            return resourceName;
        }
        // Parse name of target method.
        return MethodUtil.resolveMethodName(method);
    }

}
