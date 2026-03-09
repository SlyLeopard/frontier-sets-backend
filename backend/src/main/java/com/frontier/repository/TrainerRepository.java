package com.frontier.repository;

// Imports
import org.springframework.stereotype.Repository;

import com.frontier.model.Trainer;
import com.frontier.repository.base.BaseRepository;
import java.util.List;


// Annotations
@Repository

// Class
public interface TrainerRepository extends BaseRepository<Trainer> {

    // Methods
    public Integer findRankByName(String name);

    public List<Trainer> findByTrainerClass(String trainerClass);

}
