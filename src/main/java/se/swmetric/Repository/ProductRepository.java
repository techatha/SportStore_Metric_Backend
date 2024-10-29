package se.swmetric.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.swmetric.entity.Product;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
}
