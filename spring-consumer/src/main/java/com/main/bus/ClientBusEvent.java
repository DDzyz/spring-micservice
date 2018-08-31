package com.main.bus;

import org.springframework.context.ApplicationEvent;

public abstract  class ClientBusEvent extends  ApplicationEvent  {

    public ClientBusEvent(Object source) {
        super(source);
    }
}