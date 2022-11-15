package com.travelbingo.client.services;

import com.travelbingo.client.entities.events.Category;
import com.travelbingo.client.models.CategoryModel;
import com.travelbingo.client.models.interfaces.BingoModel;
import com.travelbingo.client.repositories.events.CategoryRepository;
import com.travelbingo.client.services.interfaces.ServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ServiceInterface<Category> {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category addNew(CategoryModel categoryModel){
        Optional<Category> categoryOptional = categoryRepository.findCategoryByName(categoryModel.getName());
        if(categoryOptional.isPresent()){
            return categoryOptional.get();
        }
        Category categoryToAdd = new Category(categoryModel.getName(), categoryModel.getDescription());
        categoryRepository.save(categoryToAdd);
        return categoryToAdd;
    }

    @Override
    public Category findByName(String name) {
        return null;
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public List<Category> getAll(BingoModel model) {
        return null;
    }
}
