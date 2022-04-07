package com.example.profiles;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
@ConfigurationProperties("prod")
public class ProdProfile {

    private List<Integer> list;

    private String name;

    public String environment = "";

}
