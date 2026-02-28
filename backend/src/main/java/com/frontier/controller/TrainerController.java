package com.frontier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.model.Trainer;
import com.frontier.repository.TrainerRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TrainerController {

    private final TrainerRepository trainerRepository;

    @GetMapping("/trainer/{name}")
    public Trainer getTrainer(@PathVariable String name) {
        return trainerRepository.getTrainerByName(name);
    }
    
}
