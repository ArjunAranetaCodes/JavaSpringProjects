package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class MyCustomConfig {

    @Bean
    public MyCustomBean myCustomBean() {
        return new MyCustomBean();
    }
}