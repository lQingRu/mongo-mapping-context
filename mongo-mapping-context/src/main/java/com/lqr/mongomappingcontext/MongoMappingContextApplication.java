package com.lqr.mongomappingcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan(basePackages = "com.lqr.mongomappingcontextdomain")
public class MongoMappingContextApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoMappingContextApplication.class, args);
    }

}
