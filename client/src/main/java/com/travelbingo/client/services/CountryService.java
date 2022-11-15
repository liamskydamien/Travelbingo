package com.travelbingo.client.services;

import com.travelbingo.client.entities.events.Country;
import com.travelbingo.client.models.interfaces.BingoModel;
import com.travelbingo.client.repositories.events.CountryRepository;
import com.travelbingo.client.services.interfaces.ServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ServiceInterface<Country> {
    CountryRepository countryRepository;

    @Override
    public Country findByName(String name){
        return null;
    }

    @Override
    public Country findById(Long id) {
        return null;
    }

    @Override
    public List<Country> getAll(BingoModel model) {
        return null;
    }

}
