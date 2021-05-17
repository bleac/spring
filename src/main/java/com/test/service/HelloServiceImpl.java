package com.test.service;

import com.test.repository.HelloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private HelloRepository helloRepository;

    @Override
    public String sayHello(String input) {
        return helloRepository.sayHello(input);
    }
}
