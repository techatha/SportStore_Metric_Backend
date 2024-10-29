package se.swmetric.dao;

import se.swmetric.entity.Category;

import java.util.List;

public interface CategoryDao {
    Integer getCategorySize();
    List<Category> getCategories();
    Category getCategory(Long id);
    Category save(Category category);
}
