package com;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringServer3 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringServer3.class)
                .properties("server.port=8082")
                .run(args);
    }
}