package com.example.eventListeners;

import com.example.events.BasicEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class BasicEventListener {

    @EventListener
    public BasicEvent handleEvent(BasicEvent event) {
        System.out.println(event.getMessage());
        return new BasicEvent(event.getSource(), event.getMessage());
    }

}
