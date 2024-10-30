package se.swmetric.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.swmetric.Dao.ProductDao;
import se.swmetric.entity.Product;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    // Get all products
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    // Get product by ID (String to ObjectId conversion handled)
    public Optional<Product> getProductById(String id) {
        try {
            ObjectId objectId = new ObjectId(id);
            return productDao.findById(String.valueOf(objectId));
        } catch (IllegalArgumentException e) {
            // Return empty optional if the ID is not valid
            return Optional.empty();
        }
    }

    // Create a new product
    public Product createProduct(Product product) {
        return productDao.save(product);
    }

    // Update an existing product by ID
    public Optional<Product> updateProduct(String id, Product product) {
        try {
            ObjectId objectId = new ObjectId(id);
            Optional<Product> existingProduct = productDao.findById(String.valueOf(objectId));

            if (existingProduct.isPresent()) {
                product.setId(objectId); // Set the ID to ensure it updates the correct product
                return Optional.of(productDao.save(product));
            }
            return Optional.empty(); // Return empty if the product doesn't exist
        } catch (IllegalArgumentException e) {
            // Return empty optional if the ID format is invalid
            return Optional.empty();
        }
    }

    // Get products by category
    public List<Product> getProductsByCategory(String category) {
        return productDao.getProductsByCategory(category);
    }
}
