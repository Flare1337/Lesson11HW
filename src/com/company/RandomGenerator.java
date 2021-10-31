package com.company;

public class RandomGenerator {
    public int getRandomHeight() {
        var min = 46;
        var max = 56 + min;
        return (int) (Math.random() * (max - min) + min);
    }

    public int getRandomMinutes() {
        var min = 15;
        var max = 60 + min;
        return (int) (Math.random() * (max - min) + min);
    }

    public int getRandomBabyWeight() {
        var minQuantity = 3;
        var maxQuantity = 6 + 1;
        return (int) (Math.random() * (maxQuantity - minQuantity) + minQuantity);
    }

    public boolean getRandomBoolean() {
        var minQuantity = 1;
        var maxQuantity = 3 + 1;
        var result = (int) (Math.random() * (maxQuantity - minQuantity) + minQuantity);
        return result > 1;
    }

    public int getRandomAverageMark() {
        var minQuantity = 3;
        var maxQuantity = 5;
        return (int) (Math.random() * (maxQuantity - minQuantity) + minQuantity);
    }
    public int getRandomSalary() {
        var min = 2000;
        var max = 6000 + min;
        return (int) (Math.random() * (max - min) + min);
    }

    public int getRandomAmountOfInterviews() {
        var minQuantity = 1;
        var maxQuantity = 6 + 1;
        return (int) (Math.random() * (maxQuantity - minQuantity) + minQuantity);
    }

    public int getRandomAge() {
        var min = 18;
        var max = 30 + 1;
        return (int) (Math.random() * (max - min) + min);
    }


    public int getRandomAmountOfBabies() {
        var minQuantity = 1;
        var maxQuantity = 3 + 1;
        return (int) (Math.random() * (maxQuantity - minQuantity) + minQuantity);
    }

    public int getRandomCourseCost() {
        var min = 5000;
        var max = 10000;
        return (int) (Math.random() * (max - min) + min);
    }


    public int getRandomAmountOfMoths() {
        var min = 5000;
        var max = 10000;
        return (int) (Math.random() * (max - min) + min);
    }

    public int getRandomStartUpPrice() {
        var min = 500_000;
        var max = 2_000_000;
        return (int) (Math.random() * (max - min) + min);
    }

    public int getRandomAmountOfPeople() {
        var min = 10;
        var max = 50;
        return (int) (Math.random() * (max - min) + min);
    }
}
