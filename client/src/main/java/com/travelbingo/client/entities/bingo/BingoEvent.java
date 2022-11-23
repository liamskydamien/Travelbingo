package com.travelbingo.client.entities.bingo;

import com.travelbingo.client.entities.events.Bingo;
import com.travelbingo.client.entities.events.Event;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class BingoEvent {
    @EmbeddedId
    BingoEventID id;

    @ManyToOne
    @MapsId("bingoID")
    @JoinColumn(name = "bingo_id")
    Bingo bingo;

    @ManyToOne
    @MapsId("eventID")
    @JoinColumn(name = "event_id")
    Event event;

    @Column
    private boolean eventDone;
}
