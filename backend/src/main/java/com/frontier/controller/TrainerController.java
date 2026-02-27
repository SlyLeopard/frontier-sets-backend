package com.frontier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.repository.TrainerRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TrainerController {

    private final TrainerRepository trainerRepository;

    @GetMapping("/trainerTest")
    public String getMethodName() {
        return new String("This is a test of the GET /trainer endpoint");
    }
    
}
