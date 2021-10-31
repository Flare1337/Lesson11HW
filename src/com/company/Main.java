package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        RandomGenerator rg = new RandomGenerator();
        Mother mother = new Mother();
        Human human = new Human(LocalDateTime.now(), true, rg.getRandomBabyWeight(),
                                rg.getRandomHeight(), rg.getRandomBoolean(), 0);
        human.setObserver(mother);
        human.startLife(human.getBirthTime(), human.isGender(), human.getWeight(),
                          human.getHeight(), human.getLocation(), human.getAgeInYears());
    }
}
