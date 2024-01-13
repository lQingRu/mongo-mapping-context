package com.lqr.mongomappingcontext.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.TypeAlias;

@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@TypeAlias("cow")
public class Cow extends Animal {

    private Double dailyMilkOutput;
}
