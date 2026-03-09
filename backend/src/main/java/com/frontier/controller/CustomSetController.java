package com.frontier.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frontier.controller.base.BaseController;
import com.frontier.model.CustomSet;
import com.frontier.search.CustomSetSearchCriteria;
import com.frontier.service.CustomSetService;

@RestController
@RequestMapping("/custom-set")
public class CustomSetController extends BaseController<CustomSet, CustomSetSearchCriteria> {

    public CustomSetController(CustomSetService service) {
        super(service);
    }

}
