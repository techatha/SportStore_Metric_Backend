package se.swmetric.Dao;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import se.swmetric.Repository.ProductRepository;
import se.swmetric.entity.Product;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductDao {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    // Find a product by ObjectId
    public Optional<Product> findById(String id) {
        ObjectId objectId = new ObjectId(id);
        return productRepository.findById(String.valueOf(objectId));
    }

    // Get products by category
    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategoryCategoryNameIgnoreCase(category);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(ObjectId id) {
        productRepository.deleteById(String.valueOf(id));
    }
}
