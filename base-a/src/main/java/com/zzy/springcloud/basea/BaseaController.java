package com.zzy.springcloud.basea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseaController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, I'm from base-a.";
    }
}
