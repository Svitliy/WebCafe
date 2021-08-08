package com.example.webcafe.events;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class ApplicationReadyEvent {

    @EventListener(ApplicationReadyEvent.class)
    public void up() {
        System.out.println("******* Application is ready **********");

    }
}
