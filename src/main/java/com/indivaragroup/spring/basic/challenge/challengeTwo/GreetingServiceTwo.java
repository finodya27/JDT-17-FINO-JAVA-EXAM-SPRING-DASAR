package com.indivaragroup.spring.basic.challenge.challengeTwo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GreetingServiceTwo {

    private final MessageService messageService;

    public void greet() {
        System.out.println(messageService.getMessage());
    }

}