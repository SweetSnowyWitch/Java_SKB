package com.example.events;

import org.springframework.context.ApplicationEvent;

public class BasicEvent extends ApplicationEvent{

    private String message = "Basic Event is done!";

    public BasicEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
}
