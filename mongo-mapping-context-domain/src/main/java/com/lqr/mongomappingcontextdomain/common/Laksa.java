package com.lqr.mongomappingcontextdomain.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.TypeAlias;

import java.util.List;

@Getter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@TypeAlias("laksa")
public class Laksa extends Food {

    private List<String> spices;
}
