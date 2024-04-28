package com.beer.sell.common.annotation;


import com.beer.sell.common.config.AliyunOssAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import(AliyunOssAutoConfiguration.class)
public @interface EnableAliyunOss {
}



