package com.travelbingo.client.models;

import com.travelbingo.client.models.interfaces.BingoModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LocationModel implements BingoModel {
    private String name;
    private String country;
    private String description;
    private String coordinates;
}
