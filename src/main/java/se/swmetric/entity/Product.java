package se.swmetric.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import se.swmetric.util.ObjectIdDeserializer;
import se.swmetric.util.ObjectIdSerializer;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "product")
public class Product {

    @Id
    @JsonSerialize(using = ObjectIdSerializer.class)
    @JsonDeserialize(using = ObjectIdDeserializer.class)
    private ObjectId id;

    private Category category;
    private String name;
    private String description;
    private Integer discount;
    private double price;
    private int quantity;
    private String image;

    @DBRef
    @Builder.Default
    private List<Color> colors = new ArrayList<>();
}
