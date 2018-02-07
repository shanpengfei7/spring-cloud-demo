package com.pnfy.study.servicefeign.service.impl;

import com.pnfy.study.servicefeign.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "sorry, " + name;
    }
}
