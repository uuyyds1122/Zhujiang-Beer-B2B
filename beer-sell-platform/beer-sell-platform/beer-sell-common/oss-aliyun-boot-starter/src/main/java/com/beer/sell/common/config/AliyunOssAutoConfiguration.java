package com.beer.sell.common.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.beer.sell.common.service.FileUploadService;
import com.beer.sell.common.service.impl.FileUploadServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(OSS.class)
@EnableConfigurationProperties(AliyunOssProperties.class)
public class AliyunOssAutoConfiguration {
    private AliyunOssProperties properties;

    public AliyunOssAutoConfiguration(AliyunOssProperties properties) {
        this.properties = properties;
    }

    @Bean
    public OSS oss() {
        return new OSSClientBuilder().build("", "", "");
    }

    @Bean
    public FileUploadService fileUploadService() {
        return new FileUploadServiceImpl();
    }
}
