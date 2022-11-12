package com.travelbingo.oauth.repositories;

import com.travelbingo.oauth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserEmail(String email);
}