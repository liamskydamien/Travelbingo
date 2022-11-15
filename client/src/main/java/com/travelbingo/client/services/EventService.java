package com.travelbingo.client.services;

import com.travelbingo.client.entities.events.Event;
import com.travelbingo.client.models.interfaces.BingoModel;
import com.travelbingo.client.repositories.events.EventRepository;
import com.travelbingo.client.services.interfaces.ServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements ServiceInterface<Event> {
    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


    public void addNew(Event newEvent) {
        eventRepository.save(newEvent);
    }

    @Override
    public Event findByName(String name) {
        return null;
    }

    @Override
    public Event findById(Long id) {
        return null;
    }

    @Override
    public List<Event> getAll(BingoModel model) {
        return null;
    }
}
