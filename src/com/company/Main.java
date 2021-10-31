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
        human.goToKindergarten(rg.getRandomBoolean(), rg.getRandomBoolean(), rg.getRandomBoolean());
        human.beginSchoolStage(rg.getRandomMinutes(), rg.getRandomBoolean(), rg.getRandomAverageMark());
        human.enrollUniversity("New York University",
                "Understanding International Business and Finance", rg.getRandomBoolean(), rg.getRandomBoolean());
        human.findJob(rg.getRandomSalary(), rg.getRandomAmountOfInterviews(), rg.getRandomMinutes());
        human.findTheOne(rg.getRandomBoolean(), rg.getRandomBoolean(), rg.getRandomAge());
        human.makeBabies(rg.getRandomAmountOfBabies(), rg.getRandomBoolean());
        human.studySomeJava(rg.getRandomCourseCost(), rg.getRandomBoolean(), rg.getRandomAmountOfMoths());
        human.runStartUp(rg.getRandomBoolean(), rg.getRandomBoolean(),
                "Healthcare", "PositiveTech");
        human.sellStartUp(rg.getRandomStartUpPrice(), rg.getRandomBoolean(), rg.getRandomBoolean());
        human.die(rg.getRandomBoolean(), rg.getRandomBoolean(), "New York", rg.getRandomAmountOfPeople());
    }
}
