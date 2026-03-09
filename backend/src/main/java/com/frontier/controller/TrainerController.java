package com.frontier.controller;

// Imports
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.frontier.controller.base.BaseController;
import com.frontier.model.Trainer;
import com.frontier.search.TrainerSearchCriteria;
import com.frontier.service.TrainerService;

// Annotations
@RestController
@RequestMapping("/trainer")

// Class
public class TrainerController extends BaseController<Trainer, TrainerSearchCriteria> {

    public TrainerController(TrainerService service) {
        super(service);
    }

}
