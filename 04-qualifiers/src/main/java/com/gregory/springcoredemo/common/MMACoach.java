package com.gregory.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class MMACoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Regarder les matchs de Doumbé !";
    }
}
