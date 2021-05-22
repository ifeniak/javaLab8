/**package ua.lviv.iot.JavaLab9.service;


import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.JavaLab9.products.ThreeDPen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
@Data
@ApplicationScope
public class OrderService {

    private AtomicInteger id = new AtomicInteger(0);

    private Map<Integer, ThreeDPen> ThreeDPensMap = new HashMap<Integer, ThreeDPen>();

    public ThreeDPen addThreeDPen(ThreeDPen ThreeDPen) {
        Integer ThreeDPenId = id.incrementAndGet();
        ThreeDPen.setId(ThreeDPenId);
        ThreeDPensMap.put(ThreeDPenId, ThreeDPen);
        return ThreeDPen;
    }

    public ThreeDPen updateThreeDPen(Integer id, ThreeDPen ThreeDPen) {
        ThreeDPensMap.put(id, ThreeDPen);
        return ThreeDPen;
    }

    public List<ThreeDPen> getThreeDPens() {
        return ThreeDPensMap.values().stream().collect(Collectors.toList());
    }

    public ThreeDPen getThreeDPen(Integer id) {
        return ThreeDPensMap.get(id);
    }

    public void deleteThreeDPen(Integer id) {
        ThreeDPensMap.remove(id);
    }

}
**/