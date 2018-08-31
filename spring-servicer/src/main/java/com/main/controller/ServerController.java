package com.main.controller;

import com.main.channel.MessageChannelSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("test")
    public String test(){
        System.out.println("service-1");
        return "Hello server1";
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


    @StreamListener(MessageChannelSource.MESSAGE_INPUT)
    public void input(Message<String> message){
        System.out.println("消息接收成功 : " + message.getPayload());
    }

}