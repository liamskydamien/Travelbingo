package com.travelbingo.client.entities.bingo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
public class UserBingoID implements Serializable {
    @Column(name = "bingo_id")
    private Long bingoID;

    @Column(name = "user_id")
    private Long userID;
}
