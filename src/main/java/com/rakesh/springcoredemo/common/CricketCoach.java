package com.rakesh.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor" + getClass().getSimpleName()); //getSimpleName() gives you the name of the class without the package. getName() gives you the name of the class with the full package name in front
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Bowling for 15 minutes daily...";
    }
}
