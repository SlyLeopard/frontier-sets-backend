package com.frontier.controller;

// Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.frontier.model.Trainer;
import com.frontier.service.TrainerService;

// Annotations
@RestController

// Class
public class TrainerController {

    // Attributes
    @Autowired
    private TrainerService service;

    // Endpoints
    @GetMapping(value = "/trainer/{name}")
    public Trainer getTrainer(@PathVariable String name) {
        return service.getByName(name);
    }

    @GetMapping(value = "/trainers")
    public Iterable<Trainer> getAllTrainers() {
        return service.getAll();
    }

}
