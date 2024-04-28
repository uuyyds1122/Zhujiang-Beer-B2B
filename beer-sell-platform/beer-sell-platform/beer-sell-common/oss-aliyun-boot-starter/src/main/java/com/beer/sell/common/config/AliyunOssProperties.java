package com.beer.sell.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("oss.aliyun")
public class AliyunOssProperties {
    private boolean enabled;
    private String name;

    public boolean isEnabled() {
        return enabled;
    }
        
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
