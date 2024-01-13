package com.lqr.mongomappingcontext.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("animal")
@Getter
@NoArgsConstructor
@TypeAlias("animal")
@SuperBuilder(toBuilder = true)
public abstract class Animal {

    @Id
    private String id;

    private String name;
    private int age;
    private String color;
    private String owner;
}
