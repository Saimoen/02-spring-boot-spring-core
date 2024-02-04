package com.gregory.springcoredemo.config;

import com.gregory.springcoredemo.common.Coach;
import com.gregory.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
