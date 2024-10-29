package se.swmetric.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.swmetric.entity.User;

public interface UserRepository extends MongoRepository<User, Long> {
}
