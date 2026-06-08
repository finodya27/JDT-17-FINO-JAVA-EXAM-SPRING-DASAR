package com.indivaragroup.spring.basic.challenge.challengeBall;

public class BallService {

    public int calculateBlueBallsToRemove() {

        int blueBalls = 198;
        int totalBalls = 200;
        for (int x = 0; x <= blueBalls; x++) {
            double percentage = (double) (blueBalls - x) / (totalBalls - x);
            if (Math.abs(percentage - 0.98) < 0.00001) {
                return x;
            }
        }
        return -1;
    }

}