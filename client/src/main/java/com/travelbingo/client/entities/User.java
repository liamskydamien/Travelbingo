package com.travelbingo.client.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@AllArgsConstructor
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    private String userName;

    private String userEmail;

    @Column(length = 60)
    private String userPassword;

    private String userFirstName;

    private String userLastname;

    private String userRole;

    private boolean isEnabled;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return userID != null && Objects.equals(userID, user.userID);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
