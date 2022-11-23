package com.travelbingo.client.entities.user;

import com.travelbingo.client.entities.bingo.BingoEvent;
import com.travelbingo.client.entities.bingo.UserBingo;
import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Entity(name = "Users")
@Getter
@Setter
@Table(name = "Users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String eMail;
    @Column
    private String password;
    @Column
    private String userrole;
    @Column
    private boolean enabled =false;

    @OneToMany(mappedBy = "user")
    Set<UserBingo> userBingoSetSet;

}