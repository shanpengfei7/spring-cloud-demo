package com.pnfy.study.servicefeign.controller;

import com.pnfy.study.servicefeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("hi")
    public String hello(String name) {
        return helloService.hello(name);
    }
}
