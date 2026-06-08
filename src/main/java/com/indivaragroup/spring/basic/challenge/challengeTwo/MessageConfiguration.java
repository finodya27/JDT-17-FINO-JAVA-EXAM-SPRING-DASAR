package com.indivaragroup.spring.basic.challenge.challengeTwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public MessageService messageService() {
        return new MessageService();
    }

    @Bean
    public GreetingServiceTwo greetingServiceTwo(
            MessageService messageService
    ) {
        return new GreetingServiceTwo(messageService);
    }

}