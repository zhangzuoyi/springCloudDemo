package com.zzy.springcloud.baseb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BasebApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasebApplication.class, args);
    }
}
