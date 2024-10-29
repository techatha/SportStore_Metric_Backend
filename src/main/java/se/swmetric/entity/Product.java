package se.swmetric.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "product")
public class Product {
    @Id
    ObjectId id;
    Category category;
    String name;
    String description;
    Integer discount;
    double price;
    int quantity;
    String image;

    @DBRef // This annotation is used for referencing other documents
    @Builder.Default
    List<Color> colors = new ArrayList<>();
}
