package com.frontier.model.dto;

import com.frontier.model.Trainer;

import lombok.Data;

@Data
public class TrainerDTO {

    private String name;
    private String trainerClass;
    private Integer rank;

    public static TrainerDTO fromEntity(Trainer trainer) {
        TrainerDTO dto = new TrainerDTO();
        dto.setName(trainer.getName());
        dto.setTrainerClass(trainer.getTrainerClass());
        dto.setRank(trainer.getRank());
        return dto;
    }
    
}
