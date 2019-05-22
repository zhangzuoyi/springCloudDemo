package com.zzy.springcloud.basea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BaseaApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseaApplication.class, args);
    }
}
