package com.pnfy.study.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {

        String url = "http://SERVICE-HI/hi?name=" + name;
        return restTemplate.getForObject(url, String.class);
    }

    public String hiError(String name) {
        return "hi, " + name + " , sorry, error";
    }
}
