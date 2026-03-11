package com.frontier.repository;

import org.springframework.stereotype.Repository;

import com.frontier.model.Trainer;
import com.frontier.repository.base.BaseRepository;

import java.util.List;

@Repository
public interface TrainerRepository extends BaseRepository<Trainer> {

    public Integer findRankByName(String name);

    public List<Trainer> findByJob(String job);

}
