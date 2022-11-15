package com.travelbingo.client.services.interfaces;

import com.travelbingo.client.models.interfaces.BingoModel;

import java.util.List;

public interface ServiceInterface<T> {
    T findByName(String name);
    T findById(Long id);
    List<T> getAll(BingoModel model);
}
