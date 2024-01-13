package com.lqr.mongomappingcontext.service;

import com.lqr.mongomappingcontext.repository.FoodMongoRepository;
import com.lqr.mongomappingcontextdomain.common.Food;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodMongoRepository foodMongoRepository;

    public List<Food> findAllFood() {
        return foodMongoRepository.findAll();
    }

    public Food saveFood(Food food) {
        return foodMongoRepository.save(food);
    }

    public void deleteAll() {
        foodMongoRepository.deleteAll();
    }
}
