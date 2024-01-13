package com.lqr.mongomappingcontext.service;

import com.lqr.mongomappingcontext.domain.Animal;
import com.lqr.mongomappingcontext.repository.AnimalMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalMongoRepository animalMongoRepository;

    public List<Animal> findAllAnimals() {
        return animalMongoRepository.findAll();
    }

    public Animal saveAnimal(Animal animal) {
        return animalMongoRepository.save(animal);
    }

    public void deleteAll() {
        animalMongoRepository.deleteAll();
    }
}
