package com.indivaragroup.spring.basic.challenge.challengeThree.configuration;

import com.indivaragroup.spring.basic.challenge.challengeThree.Animal;
import com.indivaragroup.spring.basic.challenge.challengeThree.AnimalService;
import com.indivaragroup.spring.basic.challenge.challengeThree.Cat;
import com.indivaragroup.spring.basic.challenge.challengeThree.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnimalPrimaryConfiguration {

    @Bean
    @Primary
    public Cat catPrimary() {
        return new Cat();
    }

    @Bean
    public Dog dogPrimary() {
        return new Dog();
    }

    @Bean
    public AnimalService animalServicePrimary(
            Animal animal
    ) {
        return new AnimalService(animal);
    }
}