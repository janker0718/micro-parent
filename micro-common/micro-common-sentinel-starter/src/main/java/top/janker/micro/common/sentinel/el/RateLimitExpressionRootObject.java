package top.janker.micro.common.sentinel.el;

/**
 * @author janker
 * @date 2022/1/1
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
public class RateLimitExpressionRootObject {
    private final Object object;
    private final Object[] args;

    public RateLimitExpressionRootObject(Object object, Object[] args) {
        this.object = object;
        this.args = args;
    }

    public Object getObject() {
        return object;
    }

    public Object[] getArgs() {
        return args;
    }
}
