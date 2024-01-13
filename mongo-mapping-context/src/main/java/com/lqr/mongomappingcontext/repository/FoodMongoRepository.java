package com.lqr.mongomappingcontext.repository;

import com.lqr.mongomappingcontextdomain.common.Food;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodMongoRepository extends MongoRepository<Food, String> {
}
