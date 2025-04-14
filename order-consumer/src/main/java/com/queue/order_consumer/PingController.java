package com.queue.order_consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping")
    private String ping() {
        return "pong";
    }
}
