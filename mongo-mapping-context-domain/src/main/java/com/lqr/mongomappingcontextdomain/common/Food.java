package com.lqr.mongomappingcontextdomain.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("food")
@Getter
@NoArgsConstructor
@TypeAlias("food")
@SuperBuilder(toBuilder = true)
public abstract class Food {

    @Id
    private String id;
    private String name;
    private Double nutritionalValue;
}
