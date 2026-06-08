package com.indivaragroup.spring.basic.challenge.challengeSix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfiguration {

    @Bean
    public CalculatorService calculatorService() {
        return new CalculatorService();
    }

    @Bean
    public CalculatorRunner calculatorRunner(
            CalculatorService calculatorService
    ) {
        return new CalculatorRunner(
                calculatorService
        );
    }

}