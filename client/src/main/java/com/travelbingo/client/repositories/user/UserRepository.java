package com.travelbingo.client.repositories.user;

import com.travelbingo.client.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select s from Users s WHERE s.eMail =?1" )
    User findUserByEMail(String EMail);
}
