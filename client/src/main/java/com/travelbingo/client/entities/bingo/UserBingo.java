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
            name = "user_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_CODE"))
    private User user;

    public UserBingo(Bingo bingo, User user) {
        this.bingo = bingo;
        this.user = user;
    }
}