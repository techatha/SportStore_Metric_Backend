package se.swmetric.dao;

import se.swmetric.entity.Color;

import java.util.List;

public interface ColorDao {
    Integer getColorSize();
    List<Color> getColors();
    Color getColor(Long id);
    Color save(Color color);
}
