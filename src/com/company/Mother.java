package com.company;

import java.time.LocalDateTime;

public class Mother implements IHumanObserver {
    @Override
    public void onBirth(LocalDateTime birthTime, boolean gender, float weight, int height, boolean location, int ageInYears) throws InterruptedException {
        if (gender) {
            System.out.println("Mother: My boy!");
        }
        else {
            System.out.println("Mother: My girl!");
        }

        Thread.sleep(1000);
        if (weight > 5) {
            System.out.println("Mother: Oh, you'll be the strong one.");
        }
        else {
            System.out.println("Mother: You're my little wonder.");
        }

        Thread.sleep(1500);
        if (location) {
            System.out.println("Mother: I'm so glad that we managed to get back home in time.");
        }
        else {
            System.out.println("Mother: In spite of the fact we couldn't get back home in time," +
                    "\nthe local doctors turned up to be professional enough.");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onKindergarten(Human.KindergartenParams params) throws InterruptedException {
        if (params.isChildHappy) {
            System.out.println("Mother: *talks with her friends about happy moments that happened last week*");
        }
        else {
            System.out.println("Mother: *talks with her friends about mental health of children*");
        }
        Thread.sleep(1000);
        System.out.println("*A few moments later*");
        Thread.sleep(1500);
        if (params.isLuxuriousKindergarten) {
            System.out.println("Mother: You should be more patient! I'll buy only one toy!");
        }
        else {
            System.out.println("Mother: Do you want this little toy soldier?");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onSchool(Human.SchoolStage params) throws InterruptedException {
        if (params.amountOfMinutesToGetToSchool < 20) {
            System.out.println("Mother: It’s so good that we live near the school.");
        }
        else {
            System.out.println("Mother: Well, at least the bus stop is literally in front of our house.");
        }
        Thread.sleep(1500);
        if (params.isSecondarySchoolOfMathematics) {
            System.out.println("Mother: You'll be as smart as your father! Study hard and you will be rewarded.");
        }
        else {
            System.out.println("Mother: I've found a music school nearby, I'll be fun I swear.");
        }
        Thread.sleep(1000);
        System.out.println("*A couple of years later*");
        Thread.sleep(2000);
        if (params.averageMark > 3) {
            System.out.println("Mother: That's what I said! I'm proud of you.");
        }
        else {
            System.out.println("Mother: Don't worry, I'll hire a tutor and we'll overcome this.");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onUniversity(Human.UniversityStage params) throws InterruptedException {
        if (params.isFreeEducation) {
            System.out.println("Mother: It's so good that you don't have to work while studying.");
        }
        else {
            System.out.println("Mother: Anyway I don't want you to go to work, I can handle with education cost by myself.");
        }
        Thread.sleep(1500);
        if (params.isWorkWhileStudy) {
            System.out.println("Mother: You should stop working so much! I'll end badly.");
        }
        else {
            System.out.println("Mother: I believe that you'll be a great man.");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onFindingJob(Human.JobStage params) throws InterruptedException {
        if (params.salary > Human.HIGH_SALARY) {
            System.out.println("Mother: I'm proud of you!");
        }
        else {
            System.out.println("Mother: Good for start anyway.");
        }
        Thread.sleep(1500);
        if (params.amountOfInterviews < Human.A_LOT_INTERVIEWS) {
            System.out.println("Mother: You have some persuasive talents.");
        }
        else {
            System.out.println("Mother: Good for start anyway.");
        }
        Thread.sleep(1500);
        if (params.timeInMinutesFromWorkplace < Human.A_LOT_INTERVIEWS) {
            System.out.println("Mother: Going to workplace on foot is good for health.");
        }
        else {
            System.out.println("Mother: That's too far from home, don't you think?");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onSeekingForWife(Human.FindingWifeStage params) throws InterruptedException {
        if (params.isMotherLikes) {
            System.out.println("Mother: What a beautiful fiance.");
        }
        else  {
            System.out.println("Mother: I don't like her, really. But it's your choice.");
        }
        Thread.sleep(1500);
        if (params.isRich) {
            System.out.println("Mother: Hmm, but maybe that's a real chance for you...");
        }
        else {
            System.out.println("Mother: I've always said, a man should be the breadwinner!");
        }
        Thread.sleep(1500);
        if (params.herAge <= Human.YOUNG_AGE) {
            System.out.println("Mother: And she's really young.");
        }
        else {
            System.out.println("Mother: And she's experienced, isn't she?");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onHavingKids(Human.BabiesStage params) throws InterruptedException {
        if (params.kidsQuantity >= Human.BABIES) {
            System.out.println("Mother: The more descendants, the better.");
        }
        else  {
            System.out.println("Mother: One more family member is on the way!");
        }
        Thread.sleep(1500);
        if (params.gender) {
            System.out.println("Mother: Your boy will be smart and strong.");
        }
        else  {
            System.out.println("Mother: I've always dreamt of at least one girl.");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onStudyingJava(Human.JavaLearnStage params) throws InterruptedException {
        if (params.cost >= Human.CHEAP) {
            System.out.println("Mother: Maybe you're right and it's time to change something," +
                    "\nbut it's a bit expensive, don't you think?");
        }
        else {
            System.out.println("Mother: If you wish so try out this course, it's not that expensive.");
        }
        Thread.sleep(1500);
        if (params.isOnlineCourse) {
            System.out.println("Mother: So much money for online courses? Really?");
        }
        else {
            System.out.println("Mother: Try out, why not?");
        }
        Thread.sleep(1500);
        if (params.amountOfMonthsToBecomeJunior < Human.MUCH_TIME) {
            System.out.println("Mother: You've always been a smart and fast-paced in learning something new.");
        }
        else {
            System.out.println("Mother: Everything new needs some time to understand, especially such an intricate thing");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onRunningStartUp(Human.StartUpStage params) throws InterruptedException {
        if (params.isDivorced) {
            System.out.println("Mother: That's patient of her to support you during the stage and all the hardships.");
        }
        else {
            System.out.println("Mother: Your business destroys your personal life!");
        }
        Thread.sleep(1500);
        if (params.isSuccessful) {
            System.out.println("Mother: I've always believed that you'll be a successful man!");
        }
        else {
            System.out.println("Mother: Don't despair, some day your product will be successful!");
        }
        Thread.sleep(1500);
        if (params.lineOfBusiness.equals("Healthcare")) {
            System.out.println("Mother: It's so sublime to help people this way.");
        }
        else {
            System.out.println("Mother: Sounds like something very modern and trendy.");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onSellingStartUp(Human.SellStartUpStage params) throws InterruptedException {
        if (params.price > Human.HIGH_PRICE) {
            System.out.println("Mother: That's a lot of money!");
        }
        else {
            System.out.println("Mother: You've invested so much effort in your company, they could pay you much more!");
        }
        Thread.sleep(1500);
        if (params.isEnoughMoneyToRetire) {
            System.out.println("Mother: Now can finally have a rest.");
        }
        else {
            System.out.println("Mother: Maybe we would need some additional source of income.");
        }
        Thread.sleep(1500);
        if (params.isHappyWithSpentEffortsAndTime) {
            System.out.println("Mother: If you happy, I'm happy. But I'm also really proud of you.");
        }
        else {
            System.out.println("Mother: Chin up, it wasn't that bad at all.");
        }
        Thread.sleep(1000);
    }

    @Override
    public void onDeath(Human.DeathStage params) throws InterruptedException {
        if (params.isWifeCame) {
            System.out.println("Mother: It's, just, so nice to meet you that day.");
        }
        else {
            System.out.println("Mother: Oh, if only his wife was here...");
        }
        Thread.sleep(1500);
        if (params.isDiedFromAge) {
            System.out.println("Mother: At least, it wasn't so unexpected... But it doesn't make better.");
        }
        else {
            System.out.println("Mother: He could live a much more longer life...");
        }
        Thread.sleep(1500);
        if (params.placeWhereHeDied.equals("New York")) {
            System.out.println("Mother: You're will be near your father as you wished.");
        }
        else {
            System.out.println("Mother: Anyway cremation is a good way to let you go...");
        }
        Thread.sleep(1500);
        if (params.amountOfPeopleAtFuneral >= Human.A_LOT_OF_PEOPLE) {
            System.out.println("Mother: So many people came to say goodbye to you. You deserved it.");
        }
        else {
            System.out.println("Mother: There are only your loved ones.");
        }
        Thread.sleep(1000);
    }
}
