package com.travelbingo.client.services;

import com.travelbingo.client.entities.events.Category;
import com.travelbingo.client.models.CategoryModel;
import com.travelbingo.client.repositories.events.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category addCategory(CategoryModel categoryModel){
        Optional<Category> categoryOptional = categoryRepository.findCategoryByName(categoryModel.getName());
        if(categoryOptional.isPresent()){
            return categoryOptional.get();
        }
        Category categoryToAdd = new Category(categoryModel.getName(), categoryModel.getDescription());
        categoryRepository.save(categoryToAdd);
        return categoryToAdd;
    }
}
