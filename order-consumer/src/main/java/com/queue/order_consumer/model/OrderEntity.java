package com.queue.order_consumer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class OrderEntity {

    @Id
    private String id;
    private String client;
    private String data;
    private LocalDateTime creationDate;


}
