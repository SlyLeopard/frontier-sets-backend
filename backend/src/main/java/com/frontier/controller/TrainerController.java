package com.frontier.controller;

// Imports
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.frontier.model.Trainer;
import com.frontier.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;

// Annotations
@RestController

// Class
public class TrainerController {

    // Attributes
    @Autowired
    private TrainerRepository trainerRepository;

    // Endpoints
    @GetMapping("/trainer/{name}")
    public Trainer getTrainer(@PathVariable String name) {
        return trainerRepository.findByName(name);
    }

    @GetMapping("/trainers")
    public Iterable<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }
    
}
