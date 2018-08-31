package com.main.controller;

import com.main.channel.MessageChannelSource;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {MessageChannelSource.class})
@EnableDiscoveryClient
public class SpringConfiguration {
}