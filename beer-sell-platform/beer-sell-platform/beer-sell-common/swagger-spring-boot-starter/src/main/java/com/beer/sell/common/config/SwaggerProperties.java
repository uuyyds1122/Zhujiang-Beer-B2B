package com.beer.sell.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("swagger")
@Data
public class SwaggerProperties {
    private String basePackage;
    private boolean enable = false;
    private String title;
    private String description;
    private String version;
    private String name;
    private String url;
    private String email;

}
