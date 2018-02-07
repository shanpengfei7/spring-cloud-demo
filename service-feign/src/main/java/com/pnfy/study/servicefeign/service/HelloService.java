package com.pnfy.study.servicefeign.service;

import com.pnfy.study.servicefeign.service.impl.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi", fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping("hi")
    String hello(@RequestParam(value = "name") String name);
}
