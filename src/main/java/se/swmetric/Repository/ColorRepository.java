package se.swmetric.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.swmetric.entity.Category;

public interface ColorRepository extends MongoRepository<Category, Long> {
}
