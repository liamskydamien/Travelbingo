package com.travelbingo.client.entities.bingo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class BingoEventID implements Serializable {

    @Column(name = "event_id")
    private Long eventID;

    @Column(name = "bingo_id")
    private Long bingoID;

}
