package com.example.beans;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("test")
@Service
public class TestBean {
    @PostConstruct
    public void init() {
        System.out.println("Test Bean works!");
    }
}
