package com.lqr.mongomappingcontext.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.TypeAlias;

import java.util.List;

@Getter
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@TypeAlias("dog")
public class Dog extends Animal {

    private List<String> tricks;
}
