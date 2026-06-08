package com.indivaragroup.spring.basic.challenge.challengeThree.configuration;

import com.indivaragroup.spring.basic.challenge.challengeThree.Animal;
import com.indivaragroup.spring.basic.challenge.challengeThree.AnimalService;
import com.indivaragroup.spring.basic.challenge.challengeThree.Cat;
import com.indivaragroup.spring.basic.challenge.challengeThree.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalErrorConfiguration {

    @Bean
    public Cat catError() {
        return new Cat();
    }

    @Bean
    public Dog dogError() {
        return new Dog();
    }

    @Bean
    public AnimalService animalServiceError(
            Animal animal
    ) {
        return new AnimalService(animal);
    }
}