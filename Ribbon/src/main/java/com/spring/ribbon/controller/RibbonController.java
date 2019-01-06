package com.spring.ribbon.controller;

import com.spring.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @GetMapping("/rb")
    public String ribbon(@RequestParam String name) {
        return ribbonService.hiService(name);
    }
}
