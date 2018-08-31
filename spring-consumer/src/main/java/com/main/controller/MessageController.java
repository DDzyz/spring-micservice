package com.main.controller;

import com.main.channel.MessageChannelSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    @Output(MessageChannelSource.MESSAGE_OUTPUT)
    private MessageChannel messageChannel;

    @GetMapping("sendMessage")
    public String sendMessage(@RequestParam String message) {
//        MessageBuilder
        messageChannel.send(MessageBuilder.withPayload(message).build());
        return "success";
    }
}