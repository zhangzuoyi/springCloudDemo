package com.zzy.springcloud.baseb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasebController {

    @GetMapping("/hi")
    public String hi(){
        return "Hi, I'm from base-b.";
    }
}
