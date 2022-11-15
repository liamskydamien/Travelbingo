package com.travelbingo.client.models;

import com.travelbingo.client.models.interfaces.BingoModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventModel implements BingoModel {
    private String name;
    private LocationModel location;
    private CategoryModel category;
    private String description;
}
