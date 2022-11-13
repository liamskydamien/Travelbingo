package com.travelbingo.client.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventModel {
    private String name;
    private LocationModel location;
    private CategoryModel category;
    private String description;
}
