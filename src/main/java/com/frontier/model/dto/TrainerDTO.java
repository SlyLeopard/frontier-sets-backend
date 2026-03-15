package com.frontier.model.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.frontier.model.Trainer;

import lombok.Data;

@Data
@JsonPropertyOrder({
    "name",
    "job",
    "rank",
})
public class TrainerDTO {

    private String name;
    private String job;
    private int rank;

    public static TrainerDTO fromEntity(Trainer trainer) {
        TrainerDTO dto = new TrainerDTO();
        dto.setName(trainer.getName());
        dto.setJob(trainer.getJob());
        dto.setRank(trainer.getRank());
        return dto;
    }
    
}
