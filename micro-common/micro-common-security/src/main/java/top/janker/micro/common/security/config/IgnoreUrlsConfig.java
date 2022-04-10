package top.janker.micro.common.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @author janker
 * @date 2022/4/10
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "micro.security.ignored")
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();

}
