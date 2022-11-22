package com.travelbingo.client.repositories.events;

import com.travelbingo.client.entities.events.Category;
import com.travelbingo.client.entities.events.Event;
import com.travelbingo.client.entities.events.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Long> {
    public Optional<Event> findEventByName(String Name);
    public List<Event> findEventsByCategory(Category category);
    public List<Event> findEventsByLocation(Location location);

    public List<Event> findEventsByLocation_Country(Location location);

}
