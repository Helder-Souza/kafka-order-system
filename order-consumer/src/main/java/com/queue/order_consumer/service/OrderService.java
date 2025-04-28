package com.queue.order_consumer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.queue.order_consumer.model.OrderEntity;
import com.queue.order_consumer.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    private ObjectMapper objectMapper = new ObjectMapper();

    public void processOrder(String msg) {
        try {
            orderRepository.save(objectMapper.readValue(msg, OrderEntity.class));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
