package se.swmetric.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import se.swmetric.entity.Product;

import java.util.List;

import java.util.List;

@Repository

public interface ProductRepository extends MongoRepository<Product, ObjectId> {

    List<Product> findByCategoryCategoryNameIgnoreCase(String categoryName);
}
