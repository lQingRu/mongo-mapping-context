package com.lqr.mongomappingcontext;

import com.lqr.mongomappingcontext.domain.Animal;
import com.lqr.mongomappingcontext.service.AnimalService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AnimalServiceTest {
    @Autowired
    AnimalService animalService;

    //    @BeforeAll
    //    public void init() {
    //        Cow cow = Cow.builder().name("Mary").age(3).dailyMilkOutput(302.0).build();
    //        Dog dog = Dog.builder().name("Dodo").age(5).tricks(List.of("walk", "play")).build();
    //        animalService.saveAnimal(cow);
    //        animalService.saveAnimal(dog);
    //    }

    @Test
    public void getAllAnimals() {
        List<Animal> animals = animalService.findAllAnimals();
        Assertions.assertEquals(2, animals.size());
    }

    @AfterAll
    public void clean() {
        animalService.deleteAll();
    }
}
