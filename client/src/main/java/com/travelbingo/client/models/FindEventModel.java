package com.travelbingo.client.models;

import com.travelbingo.client.models.interfaces.BingoModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FindEventModel implements BingoModel {
    private String name;
    private String locationName;
    private String categoryName;
    private String countryName;
}
