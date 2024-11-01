package se.swmetric.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "bill")
public class Bill {
    @Id
    Long id;
    LocalDateTime date;
    Integer total;
    @Builder.Default
    List<Product> products = new ArrayList<>();
}
