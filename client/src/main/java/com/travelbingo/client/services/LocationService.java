package com.travelbingo.client.services;

import com.travelbingo.client.entities.events.Country;
import com.travelbingo.client.entities.events.Location;
import com.travelbingo.client.models.LocationModel;
import com.travelbingo.client.repositories.events.CountryRepository;
import com.travelbingo.client.repositories.events.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.zip.CheckedOutputStream;

@Service
public class LocationService {
    private LocationRepository locationRepository;
    private CountryRepository countryRepository;

    public LocationService(LocationRepository locationRepository, CountryRepository countryRepository) {
        this.locationRepository = locationRepository;
        this.countryRepository = countryRepository;
    }

    public Location addLocation(LocationModel location) {
        Optional<Location> locationEntity = locationRepository.findLocationByName(location.getName());
        if(locationEntity.isPresent()){
            return locationEntity.get();
        }

        Country countryToAdd;
        Optional<Country> country = countryRepository.findCountryByName(location.getCountry());
        if(country.isEmpty()) {
            Country newCountry = new Country(location.getCountry());
            countryRepository.save(newCountry);
            countryToAdd = newCountry;
        }
        else {
            countryToAdd = country.get();
        }

        Location newLocation = new Location(countryToAdd,location.getName(),location.getCoordinates(), location.getDescription());
        locationRepository.save(newLocation);
        return newLocation;
    }
}
