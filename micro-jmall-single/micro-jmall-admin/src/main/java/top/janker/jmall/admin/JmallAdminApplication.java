package top.janker.jmall.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class JmallAdminApplication  {

    public static void main(String[] args) {
        SpringApplication.run(JmallAdminApplication.class, args);
    }
}
