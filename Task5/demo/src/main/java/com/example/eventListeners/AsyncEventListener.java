package com.example.eventListeners;

import com.example.events.AsyncEvent;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Async
public class AsyncEventListener {

    @EventListener
    public AsyncEvent handleEvent(AsyncEvent event) {
        System.out.println(event.getMessage());
        return new AsyncEvent(event.getSource(), event.getMessage());
    }
}
