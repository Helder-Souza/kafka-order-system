package com.queue.order_producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping")
    private String ping() {
        return "pong";
    }
}
