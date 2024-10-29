package se.swmetric.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import se.swmetric.entity.Color;

public interface ColorRepository extends MongoRepository<Color, Long> {
}
