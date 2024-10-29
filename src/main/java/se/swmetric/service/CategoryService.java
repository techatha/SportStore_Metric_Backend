package se.swmetric.service;

// CategoryService.java
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.swmetric.Repository.CategoryRepository;
import se.swmetric.entity.Category;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(ObjectId categoryId) {
        return categoryRepository.findById(categoryId);
    }

    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    public Category updateCategory(ObjectId categoryId, Category categoryDetails) {
        Optional<Category> category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            Category existingCategory = category.get();
            existingCategory.setCategoryName(categoryDetails.getCategoryName());
            existingCategory.setKind(categoryDetails.getKind());
            return categoryRepository.save(existingCategory);
        } else {
            return null;
        }
    }

    public void deleteCategory(ObjectId categoryId) {
        categoryRepository.deleteById(categoryId);
    }
}
