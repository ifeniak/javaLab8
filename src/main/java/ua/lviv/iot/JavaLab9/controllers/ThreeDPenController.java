package ua.lviv.iot.JavaLab9.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.JavaLab9.products.ThreeDPen;
import ua.lviv.iot.JavaLab9.service.ThreeDPenService;

import java.util.List;

@RestController
@RequestMapping(path = "/threeDPen")
public class ThreeDPenController {

    @Autowired
    private ThreeDPenService threeDPenService;

    @GetMapping(path = "/{id}")
    public  ResponseEntity<ThreeDPen> getThreeDPen(@PathVariable Integer id) {
        ThreeDPen threeDPen = threeDPenService.getThreeDPen(id);
        if (threeDPen != null) {
            return ResponseEntity.ok(threeDPen);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<ThreeDPen>> getThreeDPens() {
        return ResponseEntity.ok(threeDPenService.getThreeDPens());
    }

    @PostMapping
    public ResponseEntity<ThreeDPen> createBra(@RequestBody ThreeDPen threeDPen){
        //orderService.addOrder(order);
        return new ResponseEntity<>(threeDPenService.addThreeDPen(threeDPen), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ThreeDPen> updateThreeDPen(@PathVariable Integer id, @RequestBody ThreeDPen threeDPen) {
        ThreeDPen updateThreeDPen = threeDPenService.getThreeDPens().get(id);
        if (updateThreeDPen != null) {
            threeDPen.setId(id);
            threeDPenService.updateThreeDPen(id, threeDPen);
            return ResponseEntity.ok(threeDPen);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteThreeDPen(@PathVariable Integer id, @RequestBody ThreeDPen threeDPen) {
        ThreeDPen deletedThreeDPen = threeDPenService.getThreeDPens().get(id);
        if (deletedThreeDPen != null) {
            threeDPenService.deleteThreeDPen(id);
            return ResponseEntity.ok("Succesfully deleted");
        }
        return ResponseEntity.notFound().build();
    }
}
