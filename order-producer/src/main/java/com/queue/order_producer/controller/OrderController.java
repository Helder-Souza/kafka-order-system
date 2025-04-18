package com.queue.order_producer.controller;

import com.queue.order_producer.model.Order;
import com.queue.order_producer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping()
    public ResponseEntity<?> newOrder(@RequestBody Order order) {
        orderService.sendOrder(order);
        return ResponseEntity.accepted().build();
    }
}
