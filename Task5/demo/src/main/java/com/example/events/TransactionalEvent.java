package com.example.events;

import org.springframework.context.ApplicationEvent;

public class TransactionalEvent extends ApplicationEvent {

    private String message = "Transactional Event is done!";

    public TransactionalEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
