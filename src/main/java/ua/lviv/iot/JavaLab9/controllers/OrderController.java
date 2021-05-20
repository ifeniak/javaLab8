/**package ua.lviv.iot.JavaLab9.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.JavaLab9.models.Order;
import ua.lviv.iot.JavaLab9.service.OrderService;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(path = "/{id}")
    public  ResponseEntity<Order> getOrder(@PathVariable Integer id) {
        Order order = orderService.getOrder(id);
        if (order != null) {
            return ResponseEntity.ok(order);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok(orderService.getOrders());
    }

    @PostMapping
    public ResponseEntity<Order> createBra(@RequestBody Order order){
        //orderService.addOrder(order);
        return new ResponseEntity<>(orderService.addOrder(order), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable Integer id, @RequestBody Order order) {
        Order updateOrder = orderService.getOrders().get(id);
        if (updateOrder != null) {
            order.setId(id);
            orderService.updateOrder(id, order);
            return ResponseEntity.ok(order);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable Integer id, @RequestBody Order order) {
        Order deletedOrder = orderService.getOrders().get(id);
        if (deletedOrder != null) {
            orderService.deleteOrder(id);
            return ResponseEntity.ok("Succesfully deleted");
        }
        return ResponseEntity.notFound().build();
    }
}
*/