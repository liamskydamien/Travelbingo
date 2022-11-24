package com.travelbingo.client.services;

import com.travelbingo.client.repositories.bingo.BingoEventRepository;
import com.travelbingo.client.repositories.bingo.BingoRepository;
import org.springframework.stereotype.Service;

@Service
public class BingoService {
    private final BingoRepository bingoRepository;
    private final BingoEventRepository bingoEventRepository;

    public BingoService(BingoRepository bingoRepository, BingoEventRepository bingoEventRepository) {
        this.bingoRepository = bingoRepository;
        this.bingoEventRepository = bingoEventRepository;
    }

    public void addNew
}
