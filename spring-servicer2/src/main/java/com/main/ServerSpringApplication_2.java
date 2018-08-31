package com.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServerSpringApplication_2 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ServerSpringApplication_2.class)
                .run(args);
    }
}