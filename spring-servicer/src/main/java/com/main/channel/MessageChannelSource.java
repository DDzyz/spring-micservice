package com.main.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageChannelSource {

    public final String MESSAGE_INPUT = "input";

    @Input(MessageChannelSource.MESSAGE_INPUT)
    public SubscribableChannel input();

}
