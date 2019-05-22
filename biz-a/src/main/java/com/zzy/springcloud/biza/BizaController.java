package com.zzy.springcloud.biza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BizaController {

    @Autowired
    private BaseaClient aclient;
    @Autowired
    private BasebClient bclient;
    @GetMapping("/service")
    public String biza(){
        return aclient.hello()+" "+bclient.hi();
    }
}
