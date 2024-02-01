package com.gregory.springcoredemo.rest;

import com.gregory.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    // Define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("basketCoach") Coach theCoach,
                          @Qualifier("basketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor : " +  getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comapring beans : myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
