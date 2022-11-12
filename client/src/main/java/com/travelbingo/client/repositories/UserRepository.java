package com.travelbingo.client.repositories;

import com.travelbingo.client.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserEmail(String email);
}
