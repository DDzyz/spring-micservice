package com.main.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class HystrixController {

    private RestTemplate restTemplate;

    @GetMapping("test")
    public String test(){
//        Future future = new FutureTask()
        return "hello world";
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}