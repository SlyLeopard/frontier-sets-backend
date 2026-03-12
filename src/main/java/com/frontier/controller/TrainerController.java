package com.frontier.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.controller.base.BaseController;
import com.frontier.model.Trainer;
import com.frontier.model.dto.TrainerDTO;
import com.frontier.search.TrainerSearchCriteria;
import com.frontier.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController extends BaseController<Trainer, TrainerSearchCriteria, TrainerDTO> {

    public TrainerController(TrainerService service) {
        super(service);
    }

}
