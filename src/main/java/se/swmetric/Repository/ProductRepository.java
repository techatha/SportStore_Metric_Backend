package se.swmetric.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.swmetric.entity.Product;


public interface ProductRepository extends MongoRepository<Product, Long> {
}
