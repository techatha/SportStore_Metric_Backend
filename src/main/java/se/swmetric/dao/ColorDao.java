package se.swmetric.dao;

import org.bson.types.ObjectId;
import se.swmetric.entity.Color;

import java.util.List;

public interface ColorDao {
    Integer getColorSize();
    List<Color> getColors();
    Color getColor(ObjectId id);
    Color save(Color color);
}
