package com.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello World";
    }

    @GetMapping("/test/{url}")
    public String test(@PathVariable(value = "url") String url) {
        System.out.println(applicationName);
        return restTemplate.getForObject("http://localhost:8080/"+url, String.class);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}