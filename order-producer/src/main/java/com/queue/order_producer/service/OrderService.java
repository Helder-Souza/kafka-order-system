package com.queue.order_producer.service;

import com.queue.order_producer.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private final KafkaTemplate<String, Order> kafkaTemplate;

    @Value("${spring.application.kafka.topic.orders}")
    private String topic;

    public OrderService(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOrder(Order order) {
        kafkaTemplate.send(topic, order);
    }
}
