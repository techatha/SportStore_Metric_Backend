package se.swmetric.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "product")
public class Product {
    @Id
    Long id;
    Category category;
    String name;
    String description;
    Integer discount;
    double price;
    int quantity;
    String image;

    @DBRef // This annotation is used for referencing other documents
    List<Color> colors;
}
