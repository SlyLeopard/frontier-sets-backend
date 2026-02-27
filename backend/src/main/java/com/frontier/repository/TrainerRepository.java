package com.frontier.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TrainerRepository {

    public String getTrainerById(String id) {
        return new String("This is a test of the GET /trainer/" + id + " endpoint");
    }
    
}
