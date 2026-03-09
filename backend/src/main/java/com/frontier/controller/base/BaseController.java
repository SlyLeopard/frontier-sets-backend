package com.frontier.controller.base;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.frontier.model.base.BaseEntity;
import com.frontier.search.base.BaseSearchCriteria;
import com.frontier.service.base.BaseService;

public abstract class BaseController<T extends BaseEntity, C extends BaseSearchCriteria> {

    protected final BaseService<T, ?, C> service;

    protected BaseController(BaseService<T, ?, C> service) {
        this.service = service;
    }

    @GetMapping
    public List<T> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getById(@PathVariable String id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<T> getByName(@PathVariable String name) {
        return service.getByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/search")
    public ResponseEntity<Page<T>> search(@RequestBody(required = true) C criteria) {
        Page<T> results = service.search(criteria);
        return ResponseEntity.ok(results);
    }

}
