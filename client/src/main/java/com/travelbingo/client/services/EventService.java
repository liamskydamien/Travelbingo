package com.travelbingo.client.services;

import com.travelbingo.client.entities.events.Category;
import com.travelbingo.client.entities.events.Country;
import com.travelbingo.client.entities.events.Event;
import com.travelbingo.client.entities.events.Location;
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
        return eventRepository.findEventByName(name).orElseThrow();
    }

    public List<Event> findByCategory(Category category){
        return eventRepository.findEventsByCategory(category);
    }

    public List<Event> findByLocation(Location location){
        return eventRepository.findEventsByLocation(location);
    }

    public List<Event> findByCountry(Country country){
        return eventRepository.findEventsByLocation_Country(country);
    }

    @Override
    public Event findById(Long id) {
        return null;
    }

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }
}
