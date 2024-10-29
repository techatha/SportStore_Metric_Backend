package se.swmetric.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import se.swmetric.Repository.CategoryRepository;
import se.swmetric.entity.Category;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CategoryDaoImpl implements CategoryDao{
    final CategoryRepository categoryRepository;
    @Override
    public Integer getCategorySize() {
        return Math.toIntExact(categoryRepository.count());
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}
