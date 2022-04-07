package com.example.beans;

import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@ConditionalOnProperty(name = "spring.datasource.username", havingValue = "Admin", matchIfMissing = false)
@Service
public class DefaultBean {
    @PostConstruct
    public void init() {
        System.out.println("Default Bean works!");
    }
}
