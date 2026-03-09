package com.frontier.controller;

// Imports
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.frontier.model.Trainer;
import com.frontier.repository.TrainerRepository;
import com.frontier.service.TrainerService;

import org.springframework.beans.factory.annotation.Autowired;

// Annotations
@RestController

// Class
public class TrainerController {

    // Attributes
    private TrainerService service;

    // Endpoints
    @GetMapping(value = "/trainer/{name}")
    public Trainer getTrainer(@PathVariable String name) {
        return service.getTrainer(name);
    }

    @GetMapping(value = "/trainers")
    public Iterable<Trainer> getAllTrainers() {
        return service.getAllTrainers();
    }

}
