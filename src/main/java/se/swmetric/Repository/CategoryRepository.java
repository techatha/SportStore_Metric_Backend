package se.swmetric.Repository;

// CategoryRepository.java
import org.springframework.data.mongodb.repository.MongoRepository;
import se.swmetric.entity.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {
    // You can add custom query methods if needed
}
