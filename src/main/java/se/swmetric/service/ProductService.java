package se.swmetric.service;

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

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productDao.findById(id);
    }

    public Product createProduct(Product product) {
        return productDao.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        Optional<Product> existingProduct = productDao.findById(id);
        if (existingProduct.isPresent()) {
            product.setId(id); // Set the ID to ensure it updates the right product
            return productDao.save(product);
        }
        return null;
    }

    public boolean deleteProduct(Long id) {
        if (productDao.findById(id).isPresent()) {
            productDao.deleteById(id);
            return true;
        }
        return false;
    }
}
