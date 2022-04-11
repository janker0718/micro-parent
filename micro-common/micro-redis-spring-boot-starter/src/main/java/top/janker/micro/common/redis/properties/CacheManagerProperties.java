package top.janker.micro.common.redis.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author janker
 * @date 2022/4/11
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "micro.cache-manager")
public class CacheManagerProperties {
    private List<CacheConfig> configs;

    @Setter
    @Getter
    public static class CacheConfig {
        /**
         * cache key
         */
        private String key;
        /**
         * 过期时间，sec
         */
        private long second = 60;
    }
}