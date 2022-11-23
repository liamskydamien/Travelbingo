package com.travelbingo.client.entities.events;

import com.travelbingo.client.entities.bingo.BingoEvent;
import com.travelbingo.client.entities.bingo.UserBingo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Bingo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "bingo")
    Set<BingoEvent> bingoEventSet;

    @OneToMany(mappedBy = "bingo")
    Set<UserBingo> userBingoSet;
    public Bingo(String name) {
        this.name = name;
    }
}
