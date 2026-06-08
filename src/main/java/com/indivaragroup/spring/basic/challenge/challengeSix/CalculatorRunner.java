package com.indivaragroup.spring.basic.challenge.challengeSix;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CalculatorRunner {

    private final CalculatorService calculatorService;

    public void run() {

        System.out.println(
                "10 + 5 = "
                        + calculatorService.add(10, 5)
        );

        System.out.println(
                "10 - 5 = "
                        + calculatorService.subtract(10, 5)
        );

        System.out.println(
                "10 * 5 = "
                        + calculatorService.multiply(10, 5)
        );

        System.out.println(
                "10 / 5 = "
                        + calculatorService.divide(10, 5)
        );

    }

}