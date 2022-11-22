package com.travelbingo.client.entities.bingo;

import com.travelbingo.client.entities.events.Bingo;
import com.travelbingo.client.entities.events.Event;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class BingoEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "bingo_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_Bingo_CODE"))
    private Bingo bingo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(
            name = "event_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_EVENT_CODE"))
    private Event event;
}
