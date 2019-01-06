package com.spring.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = FeignSayError.class)
public interface FeignService {

    @GetMapping("/hi")
    String sayHiFromClientOne(@RequestParam("name") String name);
}
