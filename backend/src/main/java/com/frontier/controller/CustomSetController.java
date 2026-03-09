package com.frontier.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.frontier.model.CustomSet;
import com.frontier.model.search.CustomSetSearchCriteria;
import com.frontier.service.CustomSetService;

public class CustomSetController {

    // Attributes
    private CustomSetService service;

    // Endpoints
    @GetMapping(value = "/customSet/{name}")
    public CustomSet getCustomSetByName(@PathVariable String name) {
        return service.getSetByName(name);
    }

    @GetMapping(value = "/allCustomSets")
    public Iterable<CustomSet> getAllCustomSets() {
        return service.getAll();
    }

    @PostMapping(value = "/searchCustomSets", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<CustomSet> searchCustomSets(@RequestBody(required = true) CustomSetSearchCriteria searchCriteria) {
        return service.searchCustomSets(searchCriteria);
    }

}
