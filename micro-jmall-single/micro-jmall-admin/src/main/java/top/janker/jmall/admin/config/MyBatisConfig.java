package top.janker.jmall.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author janker
 * @date 2022/4/12
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"top.janker.jmall.orm.mapper","top.janker.jmall.admin.dao"})
public class MyBatisConfig {
}
