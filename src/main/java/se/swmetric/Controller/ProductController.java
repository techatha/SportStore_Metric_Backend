package se.swmetric.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.swmetric.entity.Product;
import se.swmetric.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

//    // Get all products
//    @GetMapping
//    public List<Product> getAllProducts() {
//        for(var product : productService.getAllProducts()) {
//            System.out.println(product);
//        }
//        return productService.getAllProducts();
//    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable String id) {
        try {
            Optional<Product> product = productService.getProductById(id);
            return product.isPresent() ? ResponseEntity.ok(product.get()) : ResponseEntity.notFound().build();

        } catch (IllegalArgumentException e) {
            // Handle invalid ObjectId format
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Invalid ID format: " + id);
        }
    }
    // Get all products or filter by category
    @GetMapping
    public ResponseEntity<List<Product>> getProductsByCategory(
            @RequestParam(value = "category", required = false) String category) {
        try {
            List<Product> products = (category != null) ?
                    productService.getProductsByCategory(category) :
                    productService.getAllProducts();
            return ResponseEntity.ok(products);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }


    // Create a new product
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }


}
