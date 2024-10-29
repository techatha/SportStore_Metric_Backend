package se.swmetric.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "sale_history")
public class SaleHistory {
    @Id
    Long id;
    Product product;
    Integer saleAmount;
    Integer total;
    Bill bill;
}
