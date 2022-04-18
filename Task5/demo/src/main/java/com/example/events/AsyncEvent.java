package com.example.events;

import org.springframework.context.ApplicationEvent;

public class AsyncEvent extends ApplicationEvent{

    private String message = "Async Event is done!";

    public AsyncEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
}
