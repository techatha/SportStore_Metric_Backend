package se.swmetric.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.swmetric.entity.Bill;


public interface BillRepository extends MongoRepository<Bill, Long> {
}
