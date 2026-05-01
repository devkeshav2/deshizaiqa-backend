package com.deshizaiqa.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {
    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
                "status", "UP",
                "service", "Deshi Zaiqa Backend",
                "version", "1.0"
        );
    }
}
