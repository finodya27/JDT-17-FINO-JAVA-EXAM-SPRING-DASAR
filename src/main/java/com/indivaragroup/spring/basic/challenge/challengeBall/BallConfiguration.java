package com.indivaragroup.spring.basic.challenge.challengeBall;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BallConfiguration {

    @Bean
    public BallService ballService() {
        return new BallService();
    }

    @Bean
    public BallRunner ballRunner(BallService ballService) {
        return new BallRunner(ballService);
    }
}