package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.example.spells", "com.example.runes" })
public class MagicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MagicApplication.class, args);
    }

}
