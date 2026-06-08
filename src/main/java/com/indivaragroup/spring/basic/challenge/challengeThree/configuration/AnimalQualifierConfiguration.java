package com.indivaragroup.spring.basic.challenge.challengeThree.configuration;

import com.indivaragroup.spring.basic.challenge.challengeThree.Animal;
import com.indivaragroup.spring.basic.challenge.challengeThree.AnimalService;
import com.indivaragroup.spring.basic.challenge.challengeThree.Cat;
import com.indivaragroup.spring.basic.challenge.challengeThree.Dog;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalQualifierConfiguration {

    @Bean
    public Cat catQualifier() {
        return new Cat();
    }

    @Bean
    public Dog dogQualifier() {
        return new Dog();
    }

    @Bean
    public AnimalService animalServiceQualifier(
            @Qualifier("dogQualifier") Animal animal
    ) {
        return new AnimalService(animal);
    }
}