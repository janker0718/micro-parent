package top.janker.micro.common.sentinel;

import java.lang.reflect.Method;

/**
 * @author janker
 * @date 2021/12/18
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
public abstract class RequestRateLimit {
    abstract String getResourceName(Method method, String... args);
}
