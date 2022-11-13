package com.travelbingo.client.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LocationModel {
    private String name;
    private String country;
    private String description;
    private String coordinates;
}
