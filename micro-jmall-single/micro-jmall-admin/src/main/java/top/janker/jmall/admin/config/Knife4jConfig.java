package top.janker.jmall.admin.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author janker
 * @date 2021/12/17
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */

@EnableSwagger2
@EnableKnife4j
@Configuration
public class Knife4jConfig {


    @Bean(value = "defaultApi")
    public Docket defaultApi() {

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //分组名称
                .groupName("测试分组")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("top.janker.jmall.admin.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("")
                .description("micro-jmall-admin RESTful APIs")
                .termsOfServiceUrl("https://www,janker.top/")
                .version("1.0")
                .build();
    }
}
