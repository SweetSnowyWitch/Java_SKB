package com.example.profiles;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
@ConfigurationProperties("test")
public class TestProfile {

    private List<Integer> list;

    private String name;

    public String environment = "";

}
