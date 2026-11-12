package com.tas.masterSecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/health")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public String getHeath(){
        return "Healthy";
    }

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('TEST_READ')")
    public String getHello(){
        return "Hello";
    }
}
