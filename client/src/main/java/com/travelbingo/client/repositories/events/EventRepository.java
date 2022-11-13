package com.travelbingo.client.repositories.events;

import com.travelbingo.client.entities.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}
