package com.spring.feign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignSayError implements FeignService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "Hi"+ name +"  That's Feign Hystrix";
    }
}
