package com.rakesh.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary       //Removing primary and enabled qualifier
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("In Constructor" + getClass().getSimpleName()); //getSimpleName() gives you the name of the class without the package. getName() gives you the name of the class with the full package name in front
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
