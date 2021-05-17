package com.test.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {

    @Override
    public String sayHello(String input) {
        return String.format("Input was recorded %s", input);
    }
}
