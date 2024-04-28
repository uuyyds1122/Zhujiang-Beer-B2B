package com.beer.sell.portal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author XDD
 * @create 2024--04--26 16:58
 **/

@SpringBootApplication(scanBasePackages = {"com.beer"})
public class Sellportalapp {

    public static void main(String[] args) {

        SpringApplication.run(Sellportalapp.class,args);

    }
}
