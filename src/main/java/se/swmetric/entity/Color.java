package se.swmetric.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import se.swmetric.util.ObjectIdDeserializer;
import se.swmetric.util.ObjectIdSerializer;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "color")
public class Color {
    @Id
    @JsonSerialize(using = ObjectIdSerializer.class)
    @JsonDeserialize(using = ObjectIdDeserializer.class)
    ObjectId id;
    String name;
}
