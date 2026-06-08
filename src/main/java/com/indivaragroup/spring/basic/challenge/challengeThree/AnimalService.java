package com.indivaragroup.spring.basic.challenge.challengeThree;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AnimalService {

    private final Animal animal;

    public void showAnimalSound() {
        System.out.println(animal.sound());
    }

}