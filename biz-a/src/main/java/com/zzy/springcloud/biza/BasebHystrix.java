package com.zzy.springcloud.biza;

import org.springframework.stereotype.Component;

@Component
public class BasebHystrix implements BasebClient {
    @Override
    public String hi() {
        return "Sorry, baseb is down.";
    }
}
