package com.example.beans;

import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Service;

@ConditionalOnBean(value = TestBean.class)
@Service
public class ExistBean {
    @PostConstruct
    public void init() {
        System.out.println("Exist Bean works!");
    }
}
