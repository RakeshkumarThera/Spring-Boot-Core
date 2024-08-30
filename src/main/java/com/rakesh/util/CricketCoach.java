package com.rakesh.util;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Bowling for 15 minutes daily...";
    }
}
