package com.travelbingo.client.repositories.events;

import com.travelbingo.client.entities.events.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public Optional<Category> findCategoryByName(String name);
}
