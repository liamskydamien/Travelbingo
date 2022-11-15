package com.travelbingo.client.models;

import com.travelbingo.client.models.interfaces.BingoModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoryModel implements BingoModel {
    private String name;
    private String description;
}
