package com.company;

import java.time.LocalDateTime;

public class Human {
    RandomGenerator rg = new RandomGenerator();
    public static final int HIGH_SALARY = 4000;
    public static final int A_LOT_INTERVIEWS = 5;
    public static final int FAR_FROM_HOME = 30;
    public static final int YOUNG_AGE = 25;
    public static final int MUCH_TIME = 25;
    public static final int BABIES = 2;
    public static final int CHEAP = 7000;
    public static final int HIGH_PRICE = 1_000_000;
    public static final int A_LOT_OF_PEOPLE = 25;
    private IHumanObserver observer;
    private LocalDateTime birthTime;
    private boolean gender;
    private float weight;
    private int height;
    private boolean location;

    public LocalDateTime getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(LocalDateTime birthTime) {
        this.birthTime = birthTime;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean getLocation() {
        return location;
    }

    public void setLocation(boolean location) {
        this.location = location;
    }

    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    private int ageInYears;

    public Human(LocalDateTime birthTime, boolean gender, float weight, int height, boolean location, int ageInYears) throws InterruptedException {
        this.birthTime = birthTime;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.location = location;
        this.ageInYears = ageInYears;
    }

    public void setObserver(IHumanObserver observer) {
        this.observer = observer;
    }

    public void startLife(LocalDateTime birthTime, boolean gender, float weight, int height, boolean location, int ageInYears) throws InterruptedException {
        System.out.println("1. Start of the human's life");
        Thread.sleep(1000);
        observer.onBirth(birthTime,gender, weight, height, location, ageInYears);
        System.out.println("*Baby cries*");
        Thread.sleep(500);
        goToKindergarten(rg.getRandomBoolean(), rg.getRandomBoolean(), rg.getRandomBoolean());
        beginSchoolStage(rg.getRandomMinutes(), rg.getRandomBoolean(), rg.getRandomAverageMark());
        enrollUniversity("New York University",
          "Understanding International Business and Finance", rg.getRandomBoolean(), rg.getRandomBoolean());
        findJob(rg.getRandomSalary(), rg.getRandomAmountOfInterviews(), rg.getRandomMinutes());
        findTheOne(rg.getRandomBoolean(), rg.getRandomBoolean(), rg.getRandomAge());
        makeBabies(rg.getRandomAmountOfBabies(), rg.getRandomBoolean());
        studySomeJava(rg.getRandomCourseCost(), rg.getRandomBoolean(), rg.getRandomAmountOfMoths());
        runStartUp(rg.getRandomBoolean(), rg.getRandomBoolean(),
          "Healthcare", "PositiveTech");
        sellStartUp(rg.getRandomStartUpPrice(), rg.getRandomBoolean(), rg.getRandomBoolean());
        die(rg.getRandomBoolean(), rg.getRandomBoolean(), "New York", rg.getRandomAmountOfPeople());
    }

    public void goToKindergarten(boolean isLocalEstablishment, boolean isLuxuriousKindergarten, boolean isChildHappy) throws InterruptedException {
        System.out.println("2. A kindergarten moment");
        Thread.sleep(2000);
        observer.onKindergarten(isLocalEstablishment, isLuxuriousKindergarten, isChildHappy);
        Thread.sleep(1000);
        if (isLuxuriousKindergarten) {
            System.out.println("Kid: Mommy I want this, and this one too!");
        }
        else {
            System.out.println("Kid: Please, please, please!");
        }
        Thread.sleep(500);
    }
    public static class KindergartenParams {
        private boolean isLocalEstablishment;
        private boolean isLuxuriousKindergarten;
        private boolean isChildHappy;

        public KindergartenParams(boolean isLocalEstablishment, boolean isLuxuriousKindergarten, boolean isChildHappy) {
            this.isLocalEstablishment = isLocalEstablishment;
            this.isLuxuriousKindergarten = isLuxuriousKindergarten;
            this.isChildHappy = isChildHappy;
        }

        public boolean isLocalEstablishment() {
            return isLocalEstablishment;
        }

        public void setLocalEstablishment(boolean localEstablishment) {
            isLocalEstablishment = localEstablishment;
        }

        public boolean isLuxuriousKindergarten() {
            return isLuxuriousKindergarten;
        }

        public void setLuxuriousKindergarten(boolean luxuriousKindergarten) {
            isLuxuriousKindergarten = luxuriousKindergarten;
        }

        public boolean isChildHappy() {
            return isChildHappy;
        }

        public void setChildHappy(boolean childHappy) {
            isChildHappy = childHappy;
        }
    }

    public void beginSchoolStage(int amountOfMinutesToGetToSchool, boolean isSecondarySchoolOfMathematics, int averageMark) throws InterruptedException {
        System.out.println("3. School ");
        Thread.sleep(2000);
        observer.onSchool(amountOfMinutesToGetToSchool, isSecondarySchoolOfMathematics, averageMark);
        if (averageMark > 3) {
            System.out.println("Teen: It wasn't hard, huh");
        }
        else {
            System.out.println("Teen: I'm sorry mom, I'll study harder");
        }
        Thread.sleep(500);
    }
    public void enrollUniversity(String establishmentName, String specialization, boolean isFreeEducation, boolean isWorkWhileStudy) throws InterruptedException {
        System.out.println("4. University stage");
        Thread.sleep(2000);
        observer.onUniversity(establishmentName, specialization, isFreeEducation, isWorkWhileStudy);
        if (isFreeEducation) {
            System.out.println("Student: I was preparing hard to get free education");
        }
        else {
            System.out.println("Student: You mustn't suffer because of my fault! I'll carry on");
        }
        Thread.sleep(500);
    }

    public void findJob(double salary, int amountOfInterviews, int timeInMinutesFromWorkplace) throws InterruptedException {
        System.out.println("5. First job");
        Thread.sleep(2000);
        observer.onFindingJob(salary, amountOfInterviews, timeInMinutesFromWorkplace);
        if (salary > HIGH_SALARY) {
            System.out.println("Employee: Oho, study at the university wasn't in vain! The position is a fire");
        }
        else {
            System.out.println("Employee: Welp, I need more experience to get a high-paid job");
        }
        Thread.sleep(1000);
        if (amountOfInterviews < A_LOT_INTERVIEWS) {
            System.out.println("Employee: It wasn't hard to find this one");
        }
        else {
            System.out.println("Employee: A First job isn't easy to find due to lack of experience ");
        }
        Thread.sleep(1000);
        if (timeInMinutesFromWorkplace < FAR_FROM_HOME) {
            System.out.println("Employee: And it's near my house, so convenient");
        }
        else {
            System.out.println("Employee: That's not a big deal, but I have to take a bus to get to work");
        }
        Thread.sleep(500);
    }

    public void findTheOne(boolean isMotherLikes, boolean isRich, int herAge) throws InterruptedException {
        System.out.println("6. The beloved one");
        Thread.sleep(2000);
        observer.onSeekingForWife(isMotherLikes, isRich, herAge);
        if (isMotherLikes) {
            System.out.println("Future husband: As I said before, she's the one!");
        }
        else  {
            System.out.println("Future husband: You'll see, she's a beautiful person.");
        }
        Thread.sleep(1500);
        if (isRich) {
            System.out.println("Future husband: I know what are you talking about.");
        }
        else {
            System.out.println("Future husband: We are in the same situation so that's fine.");
        }
        Thread.sleep(1500);
        if (herAge <= Human.YOUNG_AGE) {
            System.out.println("Future husband: Yes, she is.");
        }
        else {
            System.out.println("Future husband: I don't want to talk about it.");
        }
        Thread.sleep(500);
    }

    public void makeBabies(int kidsQuantity, boolean gender) throws InterruptedException {
        System.out.println("7. A little wonder");
        Thread.sleep(2000);
        observer.onHavingKids(kidsQuantity, gender);
        if (kidsQuantity >= BABIES) {
            System.out.println("Father: I hope my financial support will be enough...");
        }
        else {
            System.out.println("Father: You're my little wonder!");
        }
        Thread.sleep(1500);
        if (gender) {
            System.out.println("Father: The more boys, the better!");
        }
        else {
            System.out.println("Father: My wife will be pleased...");
        }
        Thread.sleep(500);
    }

    public void studySomeJava(double cost, boolean isOnlineCourse, int amountOfMonthsToBecomeJunior) throws InterruptedException {
        System.out.println("8. A new profession, Java related profession");
        Thread.sleep(2000);
        observer.onStudyingJava(cost, isOnlineCourse, amountOfMonthsToBecomeJunior);
        if (cost > CHEAP) {
            System.out.println("Future developer: Courses are rather expensive nowadays, but I think it's worth it!");
        }
        else {
            System.out.println("Future developer: The course isn't as expensive as it could be so I'll try it out.");
        }
        Thread.sleep(1500);
        if (isOnlineCourse) {
            System.out.println("Future developer: Yeah, not a traditional one but it'll save our time!");
        }
        else {
            System.out.println("Future developer: Good old courses, nothing special but it think it's good enough.");
        }
        Thread.sleep(1500);
        if (amountOfMonthsToBecomeJunior < MUCH_TIME) {
            System.out.println("Future developer: Yes! I've finally done it!");
        }
        else {
            System.out.println("Future developer: Oh, it was a tough period but I did it.");
        }
        Thread.sleep(500);
    }

    public void runStartUp(boolean isDivorced, boolean isSuccessful, String lineOfBusiness, String companyName) throws InterruptedException {
        System.out.println("9. StartUp time!");
        Thread.sleep(2000);
        observer.onRunningStartUp(isDivorced, isSuccessful, lineOfBusiness, companyName);
        if (isDivorced) {
            System.out.println("Developer: Everything ends... But I have to move forward.");
        }
        else {
            System.out.println("Developer: It was close, but I believed that she will stay with me.");
        }
        Thread.sleep(1500);
        if (isSuccessful) {
            System.out.println("Developer: And my business thrives!");
        }
        else {
            System.out.println("Developer: I need to change direction...");
        }
        Thread.sleep(1500);
        if (lineOfBusiness.equals("Healthcare")) {
            System.out.println("Developer: I've always wanted to help people be more healthy.");
        }
        else {
            System.out.println("Developer: It's just a business.");
        }
        Thread.sleep(1500);
        if (companyName.equals("PositiveTech")) {
            System.out.println("Developer: Company name reflects my mood last three years.");
        }
        else {
            System.out.println("Developer: That was the first I thought when I had to choose the company name.");
        }
        Thread.sleep(500);
    }

    public void sellStartUp(double price, boolean isEnoughMoneyToRetire, boolean isHappyWithSpentEffortsAndTime) throws InterruptedException {
        System.out.println("10. StartUp selling...");
        Thread.sleep(2000);
        observer.onSellingStartUp(price, isEnoughMoneyToRetire, isHappyWithSpentEffortsAndTime);
        if (price > HIGH_PRICE) {
            System.out.println("CTO: That's really good money for this kind of company.");
        }
        else {
            System.out.println("CTO: It was a good deal, I hope so...");
        }
        Thread.sleep(1500);
        if (isEnoughMoneyToRetire) {
            System.out.println("CTO: Woah, I've worked enough for my country, now it's her time to work for me!");
        }
        else {
            System.out.println("CTO: It isn't hard to find a part time job with my experience.");
        }
        Thread.sleep(1500);
        if (isHappyWithSpentEffortsAndTime) {
            System.out.println("CTO: And it was certainly the best years of my career!");
        }
        else {
            System.out.println("CTO: Not the best time of my life but, it was fun anyway.");
        }
        Thread.sleep(500);
    }

    public void die(boolean isWifeCame, boolean isDiedFromAge, String placeWhereHeDied, int amountOfPeopleAtFuneral) throws InterruptedException {
        System.out.println("11. ...Death");
        Thread.sleep(2000);
        observer.onDeath(isWifeCame, isDiedFromAge, placeWhereHeDied, amountOfPeopleAtFuneral);
        if (isWifeCame) {
            System.out.println("Ghost!: Are you ignoring me as always? Hey!?");
        }
        else {
            System.out.println("Ghost!: So much people, why do they came?");
        }
        Thread.sleep(1500);
        if (isDiedFromAge) {
            System.out.println("Ghost!: Why they are so silent?");
        }
        else {
            System.out.println("Ghost!: So many people and so much noise, but why?");
        }
        Thread.sleep(1500);
        if (placeWhereHeDied.equals("New York")) {
            System.out.println("Ghost!: Looks like my home... And wait IT'S ME?");
        }
        else {
            System.out.println("Ghost!: Hmm.. This black vase looks familiar, why does my mom hugs it?");
        }
        Thread.sleep(1500);
        if (amountOfPeopleAtFuneral >= A_LOT_OF_PEOPLE) {
            System.out.println("Ghost!: Oh, at least they came to say goodbye.");
        }
        else {
            System.out.println("Ghost!: And so little people came.. Meh");
        }
        Thread.sleep(500);
    }
}
