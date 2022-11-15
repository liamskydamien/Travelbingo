package com.travelbingo.client.controllers;

import com.travelbingo.client.entities.events.Category;
import com.travelbingo.client.entities.events.Country;
import com.travelbingo.client.entities.events.Event;
import com.travelbingo.client.entities.events.Location;
import com.travelbingo.client.models.EventModel;
import com.travelbingo.client.models.FindEventModel;
import com.travelbingo.client.services.CategoryService;
import com.travelbingo.client.services.CountryService;
import com.travelbingo.client.services.EventService;
import com.travelbingo.client.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/events")
public class EventController {
    @Autowired
    private LocationService locationService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private EventService eventService;

    @PostMapping(path = "/add")
    public String addEvent(@RequestBody EventModel event){
        Location location = locationService.addNew(event.getLocation());
        Category category = categoryService.addNew(event.getCategory());
        Event newEvent = new Event(event.getName(), location, category, event.getDescription());
        eventService.addNew(newEvent);
        return "Success";
    }

    @GetMapping(path = "/get")
    public List<Event> getEvents(@RequestBody FindEventModel findEventModel){
        Location eventLocation = locationService.findByName(findEventModel.getLocationName());
        Country eventCountry = countryService.findByName(findEventModel.getCountryName());
        return eventService.getAll(findEventModel);
    }
}
