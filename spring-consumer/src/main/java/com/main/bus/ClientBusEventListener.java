package com.main.bus;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ClientBusEventListener implements ApplicationListener<ClientBusEvent> {

    public void onApplicationEvent(ClientBusEvent event) {

    }
}