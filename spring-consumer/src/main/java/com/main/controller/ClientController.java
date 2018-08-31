package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ClientController {
    @Value("${spring.application.name}")
    private String applicationName;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public String test() {
        return "Hello cline1";
    }

    @GetMapping("/{applicationName}/test")
    public String restTest(@PathVariable String applicationName) {
        List<ServiceInstance> Services = discoveryClient.getInstances(applicationName);

        int index = (int) (Math.random() * Services.size());
        ServiceInstance instance = Services.get(index);
        String url = instance.getHost() + ":" + instance.getPort();

        return restTemplate.getForObject("http://" +url + "/test", String.class);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}