package com.frontier.model.base;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import lombok.Data;

@Data
public abstract class BaseEntity {

    @Id
    private String id;

    @Indexed(unique = true)
    private String name;

    private Instant createdAt;
    private Instant updatedAt;

}
