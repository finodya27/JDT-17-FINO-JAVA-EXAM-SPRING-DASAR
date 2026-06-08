package com.indivaragroup.spring.basic.challenge.challengeBall;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BallRunner {

    private final BallService ballService;

    public void run() {
        System.out.println("Total Balls : 200");
        System.out.println("Blue Balls : 198");
        System.out.println("Non Blue Balls : 2");
        System.out.println();
        System.out.println("Blue Balls Removed : " + ballService.calculateBlueBallsToRemove());
    }
}