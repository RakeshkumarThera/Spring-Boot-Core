package com.rakesh.springcoredemo.config;

import com.rakesh.springcoredemo.common.Coach;
import com.rakesh.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
