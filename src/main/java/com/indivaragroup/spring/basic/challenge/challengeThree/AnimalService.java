package com.indivaragroup.spring.basic.challenge.challengeThree;

public class AnimalService {

    private final Animal animal;

    public AnimalService(Animal animal) {
        this.animal = animal;
    }

    public void showAnimalSound() {
        System.out.println(animal.sound());
    }

}