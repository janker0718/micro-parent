package top.janker.jmall.admin;

import org.redisson.spring.starter.RedissonAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import top.janker.micro.common.redis.RedisAutoConfigure;
import top.janker.micro.common.redis.template.RedisRepository;

@SpringBootApplication(exclude = {RedissonAutoConfiguration.class, RedisAutoConfigure.class, RedisRepository.class})
public class JmallAdminApplication  {

    public static void main(String[] args) {
        SpringApplication.run(JmallAdminApplication.class, args);
    }
}
