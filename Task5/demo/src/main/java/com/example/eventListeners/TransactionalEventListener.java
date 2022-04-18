package com.example.eventListeners;

import com.example.events.TransactionalEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;

@Service
@Transactional
public class TransactionalEventListener {

    @EventListener
    public TransactionalEvent handleEvent(TransactionalEvent event) {
        System.out.println(event.getMessage());
        return new TransactionalEvent(event.getSource(), event.getMessage());
    }

}
