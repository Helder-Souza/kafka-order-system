package com.queue.order_consumer.listener;

import com.queue.order_consumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

    @Autowired
    private OrderService orderService;

    @KafkaListener(topics = "orders", groupId = "order-group")
    public void processOrder(String msg) {
        orderService.processOrder(msg);
    }
}
