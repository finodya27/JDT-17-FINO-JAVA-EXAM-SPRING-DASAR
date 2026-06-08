package com.indivaragroup.spring.basic.challenge.challengeTwo;

public class GreetingServiceTwo {

    private final MessageService messageService;

    public GreetingServiceTwo(MessageService messageService) {
        this.messageService = messageService;
    }

    public void greet() {
        System.out.println(messageService.getMessage());
    }

}