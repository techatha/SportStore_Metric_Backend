package se.swmetric.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import se.swmetric.entity.Color;

@Repository
public interface  ColorRepository extends MongoRepository<Color, ObjectId> {
}

