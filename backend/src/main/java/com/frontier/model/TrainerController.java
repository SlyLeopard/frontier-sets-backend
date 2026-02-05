package com.frontier.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class TrainerController {

    private final TrainerRepository trainerRepository;

    @GetMapping("/trainerTest")
    public String getMethodName(@RequestParam String param) {
        return new String("This is a test of the GET /trainer endpoint");
    }
    
}
