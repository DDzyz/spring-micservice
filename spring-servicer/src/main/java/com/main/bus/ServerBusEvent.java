package com.main.bus;

import org.springframework.context.ApplicationEvent;

public abstract  class ServerBusEvent extends  ApplicationEvent  {

    public ServerBusEvent(Object source) {
        super(source);
    }
}