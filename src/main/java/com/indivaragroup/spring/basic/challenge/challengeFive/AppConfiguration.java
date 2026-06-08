package com.indivaragroup.spring.basic.challenge.challengeFive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public String applicationName() {
        return "Spring Basic Training";
    }

}