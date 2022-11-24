package com.travelbingo.client.repositories.bingo;

import com.travelbingo.client.entities.bingo.BingoEvent;
import com.travelbingo.client.entities.events.Bingo;
import com.travelbingo.client.entities.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BingoEventRepository extends JpaRepository<BingoEvent, Long> {
    @Query("SELECT u.event FROM BingoEvent u where u.bingo = :search")
    public List<Event> getEventByBingo(@Param("search") Bingo bingo);

    @Query("SELECT u.bingo from BingoEvent u where u.event = :search")
    public List<Bingo> getBingoByEvent(@Param("search") Event event);

    public boolean existsBingoEventByBingoAndEvent(Bingo bingo, Event event);
    public int countBingoEventByEventAndBingo(Event event, Bingo bingo);
}
