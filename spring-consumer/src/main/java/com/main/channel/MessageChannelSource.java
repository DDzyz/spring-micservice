package com.main.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;


public interface MessageChannelSource {
    public final String MESSAGE_OUTPUT = "output";

    @Output(MessageChannelSource.MESSAGE_OUTPUT)
    public MessageChannel output();
}
