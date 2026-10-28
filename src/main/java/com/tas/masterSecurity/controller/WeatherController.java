package com.tas.masterSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/health")
    public String getHeath(){
        return "Healthy";
    }
}
