package com.lqr.mongomappingcontext.repository;

import com.lqr.mongomappingcontext.domain.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalMongoRepository extends MongoRepository<Animal, String> {
}
