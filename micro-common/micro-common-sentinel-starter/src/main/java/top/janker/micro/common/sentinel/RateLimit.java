package top.janker.micro.common.sentinel;


import com.alibaba.csp.sentinel.EntryType;

import java.lang.annotation.*;

/**
 * @author janker
 * @date 2021/12/18
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RateLimit {

    String value();

    String param();

    EntryType entryType() default EntryType.IN;
}
