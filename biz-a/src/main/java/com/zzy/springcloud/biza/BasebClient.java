package com.zzy.springcloud.biza;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="base-b", configuration = FeignConfig.class, fallback = BasebHystrix.class)
public interface BasebClient {
    @GetMapping(value="/hi")
    String hi();
}
