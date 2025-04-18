package com.queue.order_consumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

    @KafkaListener(topics = "orders", groupId = "order-group")
    public void processOrder(String msg) {
        System.out.println("Recebi do kafka: " + msg);
    }
}
