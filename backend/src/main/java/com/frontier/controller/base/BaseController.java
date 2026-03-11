package com.frontier.controller.base;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.frontier.model.base.BaseEntity;
import com.frontier.search.base.BaseSearchCriteria;
import com.frontier.service.base.BaseService;

public abstract class BaseController<T extends BaseEntity, C extends BaseSearchCriteria, D> {

    protected final BaseService<T, ?, C, D> service;

    protected BaseController(BaseService<T, ?, C, D> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Page<D>> getAll(@RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer pageSize) {
        page = page == null ? 0 : page;
        pageSize = pageSize == null ? 20 : pageSize;
        pageSize = pageSize > 100 ? 100 : pageSize;
        Page<D> results = service.getAll(page, pageSize);
        return ResponseEntity.ok(results);
    }

    @GetMapping("/{id}")
    public ResponseEntity<D> getById(@PathVariable String id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<D> getByName(@PathVariable String name) {
        return service.getByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/search")
    public ResponseEntity<Page<D>> search(@RequestBody(required = true) C criteria,
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer pageSize) {
        page = page == null ? 0 : page;
        pageSize = pageSize == null ? 20 : pageSize;
        pageSize = pageSize > 100 ? 100 : pageSize;
        criteria.setPage(page);
        criteria.setSize(pageSize);
        Page<D> results = service.search(criteria);
        return ResponseEntity.ok(results);
    }

}
