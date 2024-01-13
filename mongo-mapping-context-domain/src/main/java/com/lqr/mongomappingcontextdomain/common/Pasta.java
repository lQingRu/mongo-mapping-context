package com.lqr.mongomappingcontextdomain.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.TypeAlias;

@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@TypeAlias("pasta")
public class Pasta extends Food {

    private Double starchAmount;
}
