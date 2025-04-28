package com.queue.order_consumer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
public class OrderEntity {

    @Id
    private String id;
    private String client;
    private String data;
    private final LocalDateTime creationDate = LocalDateTime.now();
    private OrderStatus status;

}
