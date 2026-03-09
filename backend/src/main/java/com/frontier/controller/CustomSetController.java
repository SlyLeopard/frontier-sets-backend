package com.frontier.controller;

// Imports
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.frontier.controller.base.BaseController;
import com.frontier.model.CustomSet;
import com.frontier.search.CustomSetSearchCriteria;
import com.frontier.service.CustomSetService;

// Annotations
@Controller
@RequestMapping("/custom-set")

// Class
public class CustomSetController extends BaseController<CustomSet, CustomSetSearchCriteria> {

    public CustomSetController(CustomSetService service) {
        super(service);
    }

}
