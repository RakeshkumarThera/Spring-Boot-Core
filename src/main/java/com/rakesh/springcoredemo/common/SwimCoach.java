package com.rakesh.springcoredemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In Constructor" + getClass().getSimpleName()); //getSimpleName() gives you the name of the class without the package. getName() gives you the name of the class with the full package name in front
    }
    @Override
    public String getDailyWorkout() {
        return "Do butterfly swimming";
    }
}

