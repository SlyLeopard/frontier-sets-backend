package com.frontier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frontier.model.Trainer;
import com.frontier.repository.TrainerRepository;

@Service
public class TrainerService {

    // Attributes
    @Autowired
    private TrainerRepository trainerRepo;

    public Trainer getTrainer(String name) {
        return trainerRepo.findByName(name);
    }

    public Iterable<Trainer> getAllTrainers() {
        return trainerRepo.findAll();
    }

}
