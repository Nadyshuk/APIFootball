package com.example.demo.controllers;
import com.example.demo.services.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FootballController {
    private final FootballService footballService;

    @Autowired
    public FootballController(FootballService footballService) {
        this.footballService = footballService;
    }

    @GetMapping("/data")
    public String getData() {
        // Виклик сервісу для отримання даних
        return footballService.fetchData();
    }
}
