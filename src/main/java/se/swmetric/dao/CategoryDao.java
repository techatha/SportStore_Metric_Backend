package se.swmetric.dao;

import org.bson.types.ObjectId;
import se.swmetric.entity.Category;

import java.util.List;

public interface CategoryDao {
    Integer getCategorySize();
    List<Category> getCategories();
    Category getCategory(ObjectId id);
    Category save(Category category);
}
