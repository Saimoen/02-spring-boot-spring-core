package com.gregory.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Roland Garros mameeen !";
    }
}
