package com.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${server.port}")
    String port;

    @GetMapping("/api-b/hi")
    public String test(String name) {
        return "Hello,"+name+"  I'm Port:"+port;
    }
}
