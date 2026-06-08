package com.indivaragroup.spring.basic.challenge.challengeFour;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SessionConfiguration {

    @Bean
    @Scope("prototype")
    public UserSession userSessionPrototype() {
        return new UserSession();
    }

    @Bean
    public UserSession userSessionSingleton() {
        return new UserSession();
    }

}