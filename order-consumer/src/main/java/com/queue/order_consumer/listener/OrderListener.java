package com.queue.order_consumer.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.queue.order_consumer.model.OrderEntity;
import com.queue.order_consumer.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

    @Autowired
    private OrderRepository orderRepository;

    private ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "orders", groupId = "order-group")
    public void processOrder(String msg) throws JsonProcessingException {

        System.out.println(msg);
//        objectMapper.readValue(msg, OrderEntityDTO.class);
        orderRepository.save(objectMapper.readValue(msg, OrderEntity.class));
    }
}
