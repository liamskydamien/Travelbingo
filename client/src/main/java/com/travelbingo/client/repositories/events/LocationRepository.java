package com.travelbingo.client.repositories.events;

import com.travelbingo.client.entities.events.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocationRepository extends JpaRepository<Location, Long> {
    public Optional<Location> findLocationByName(String name);
}
