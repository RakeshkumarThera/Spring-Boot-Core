package com.rakesh.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Pretty intense!! Run 5k everyday";
    }
}
