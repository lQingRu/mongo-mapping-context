package com.lqr.mongomappingcontext;

import com.lqr.mongomappingcontext.service.FoodService;
import com.lqr.mongomappingcontextdomain.common.Food;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FoodServiceTest {
    @Autowired
    FoodService foodservice;

    //    @BeforeAll
    //    public void init() {
    //        Laksa laksa = Laksa.builder().name("laksa1").build();
    //        foodservice.saveFood(laksa);
    //    }

    @Test
    public void getAllFood() {
        List<Food> food = foodservice.findAllFood();
        Assertions.assertEquals(1, food.size());
    }

    //    @AfterAll
    //    public void clean() {
    //        foodservice.deleteAll();
    //    }
}
