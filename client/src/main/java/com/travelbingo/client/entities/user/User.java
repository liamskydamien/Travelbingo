package com.travelbingo.client.entities.user;

import lombok.*;
import javax.persistence.*;

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

}