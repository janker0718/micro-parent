package top.janker.micro.common.sentinel;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author janker
 * @date 2021/12/18
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
@Data
@ConfigurationProperties("micro.sentinel")
public class SentinelProperties {
    /**
     * 是否开启sentinel
     */
    private Boolean enabled;
}
