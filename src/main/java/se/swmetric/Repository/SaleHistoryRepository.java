package se.swmetric.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.swmetric.entity.SaleHistory;

public interface SaleHistoryRepository extends MongoRepository<SaleHistory, Long> {
}
