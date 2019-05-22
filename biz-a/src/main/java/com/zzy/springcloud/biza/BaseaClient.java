package com.zzy.springcloud.biza;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="base-a", configuration = FeignConfig.class)
public interface BaseaClient {
    @GetMapping(value="/hello")
    String hello();
}
