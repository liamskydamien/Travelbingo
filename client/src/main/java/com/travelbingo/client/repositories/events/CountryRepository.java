package com.travelbingo.client.repositories.events;

import com.travelbingo.client.entities.events.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {
    public Optional<Country> findCountryByName(String name);
}
