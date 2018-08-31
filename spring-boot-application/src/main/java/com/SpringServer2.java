package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringServer2 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringServer2.class)
                .properties("server.port=8081")
                .run(args);
    }
}