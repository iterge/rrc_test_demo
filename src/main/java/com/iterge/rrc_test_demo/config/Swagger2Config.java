package com.iterge.rrc_test_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author LiuPanHui
 * @date 2022/1/22
 */

@Configuration
@EnableOpenApi
public class Swagger2Config {

    @Bean
    @Profile("dev")
    public Docket createRestApi(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.iterge.rrc_test_demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 自定义信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //标题
                .title("Spring Boot 测试使用 Swagger3 构建RESTful API")
                //创建人
                .contact(new Contact("xxx", "https://blog.csdn.net/it_erge?spm=1000.2115.3001.5343", "it_lph@126.com"))
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }

    @Bean
    @Profile("test")
    public Docket createTestRestApi(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(testApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.iterge.rrc_test_demo.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 自定义信息
     */
    private ApiInfo testApiInfo() {
        return new ApiInfoBuilder()
                //标题
                .title("提供前端使用的接口文档")
                //创建人
                .contact(new Contact("test", "https://blog.csdn.net/it_erge?spm=1000.2115.3001.5343", "it_lph@126.com"))
                //版本号
                .version("1.0")
                //描述
                .description("仅供FE同学使用接口文档，请勿外传！")
                .build();
    }
}
