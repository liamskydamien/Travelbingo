package com.travelbingo.client.entities.bingo;

import com.travelbingo.client.entities.events.Bingo;
import com.travelbingo.client.entities.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UserBingo {
    @EmbeddedId
    private UserBingoID userBingoID;

    @ManyToOne
    @MapsId("bingoID")
    @JoinColumn(name = "bingo_id")
    Bingo bingo;

    @ManyToOne
    @MapsId("userID")
    @JoinColumn(name = "user_id")
    User user;
}