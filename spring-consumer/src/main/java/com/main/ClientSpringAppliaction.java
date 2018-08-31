package com.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ClientSpringAppliaction {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientSpringAppliaction.class)
                .run(args);
    }
}