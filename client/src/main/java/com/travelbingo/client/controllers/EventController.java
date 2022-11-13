package com.travelbingo.client.controllers;

import com.travelbingo.client.entities.events.Category;
import com.travelbingo.client.entities.events.Event;
import com.travelbingo.client.entities.events.Location;
import com.travelbingo.client.models.EventModel;
import com.travelbingo.client.services.CategoryService;
import com.travelbingo.client.services.EventService;
import com.travelbingo.client.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/events")
public class EventController {
    @Autowired
    private LocationService locationService;

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private EventService eventService;

    @PostMapping(path = "/add")
    public String addEvent(@RequestBody EventModel event){
        Location location = locationService.addLocation(event.getLocation());
        Category category = categoryService.addCategory(event.getCategory());
        Event newEvent = new Event(event.getName(), location, category, event.getDescription());
        eventService.addEvent(newEvent);
        return "Success";
    }
}
