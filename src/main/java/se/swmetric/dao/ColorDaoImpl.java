package se.swmetric.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.swmetric.Repository.ColorRepository;
import se.swmetric.entity.Color;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColorDaoImpl implements ColorDao{
    final ColorRepository colorRepository;
    @Override
    public Integer getColorSize() {
        return Math.toIntExact(colorRepository.count());
    }

    @Override
    public List<Color> getColors() {
        return colorRepository.findAll();
    }

    @Override
    public Color getColor(Long id) {
        return colorRepository.findById(id).orElse(null);
    }

    @Override
    public Color save(Color color) {
        return colorRepository.save(color);
    }
}
