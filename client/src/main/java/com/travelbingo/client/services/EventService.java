package com.travelbingo.client.services;

import com.travelbingo.client.entities.events.Event;
import com.travelbingo.client.repositories.events.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


    public void addEvent(Event newEvent) {
        eventRepository.save(newEvent);
    }
}
