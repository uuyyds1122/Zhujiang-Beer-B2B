package com.beer.sell.common.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import javax.annotation.Resource;

/**
 * @author zhangwei
 */
@EnableOpenApi
@Configuration
@EnableConfigurationProperties(SwaggerProperties.class)
public class SwaggerAutoConfiguration {
    @Resource
    private SwaggerProperties swaggerProperties;
    
    @Bean
    public Docket docket(ApiInfo apiInfo) {
        return new Docket(DocumentationType.OAS_30)
                //开启swagger  生产环境需要关闭
                .enable(swaggerProperties.isEnable())
                //
                .apiInfo(apiInfo)
                //
                .select()
                //  生成在线文档的配置
                .apis(RequestHandlerSelectors.basePackage(swaggerProperties.getBasePackage()))
                //
                .paths(PathSelectors.any()).build();
    }

    @Bean
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(swaggerProperties.getTitle())
                //
                .version(swaggerProperties.getVersion()).description(swaggerProperties.getDescription())
                //
                .contact(new Contact(swaggerProperties.getName(), swaggerProperties.getUrl(), swaggerProperties.getEmail())).build();
    }

}
