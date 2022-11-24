package com.travelbingo.client.repositories.bingo;

import com.travelbingo.client.entities.events.Bingo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BingoRepository extends JpaRepository<Bingo, Long> {

}
