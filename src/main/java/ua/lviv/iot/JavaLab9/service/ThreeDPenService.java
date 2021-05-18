package ua.lviv.iot.JavaLab9.service;


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
public class ThreeDPenService {

    private AtomicInteger id = new AtomicInteger(0);

    private Map<Integer, ThreeDPen> threeDPensMap = new HashMap<Integer, ThreeDPen>();

    public ThreeDPen addThreeDPen(ThreeDPen threeDPen) {
        Integer threeDPenId = id.incrementAndGet();
        threeDPen.setId(threeDPenId);
        threeDPensMap.put(threeDPenId, threeDPen);
        return threeDPen;
    }

    public ThreeDPen updateThreeDPen(Integer id, ThreeDPen threeDPen) {
        threeDPensMap.put(id, threeDPen);
        return threeDPen;
    }

    public List<ThreeDPen> getThreeDPens() {
        return threeDPensMap.values().stream().collect(Collectors.toList());
    }

    public ThreeDPen getThreeDPen(Integer id) {
        return threeDPensMap.get(id);
    }

    public void deleteThreeDPen(Integer id) {
        threeDPensMap.remove(id);
    }

}
