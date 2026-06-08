package com.indivaragroup.spring.basic.challenge.challengeSeven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {

    @Bean
    public DatabaseConnection databaseConnection() {
        return new DatabaseConnection();
    }
}
