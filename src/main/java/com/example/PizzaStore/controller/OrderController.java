package com.example.PizzaStore.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "order", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    public record NewOrder (String pizzaStyle, String size, String email){}

    @PostMapping(path = "create")
    public ResponseEntity<?> create(@RequestBody NewOrder order){
        //INSERT ORDER INTO NEW-ORDERS TOPIC
        return ResponseEntity.ok(Map.of("message", "The order was created successfully","created", order));
    }

    public record PayingOrder (String orderId){}

    @PostMapping(path = "pay")
    public ResponseEntity<?> pay(@RequestBody PayingOrder order){
        return ResponseEntity.ok(Map.of("message", "The order " + order.orderId + " was paid successfully"));
    }
}
