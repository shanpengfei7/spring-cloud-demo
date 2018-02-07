package com.pnfy.study.servicefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-hi")
public interface HelloService {

    @RequestMapping("hi")
    String hello(String name);
}
