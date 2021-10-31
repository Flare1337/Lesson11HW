package com.company;

import java.time.LocalDateTime;

public interface IHumanObserver {
    void onBirth(LocalDateTime birthTime,
                 boolean gender,
                 float weight,
                 int height,
                 boolean location, int ageInYears) throws InterruptedException;

    void onKindergarten(boolean isLocalEstablishment,
                        boolean isLuxuriousKindergarten,
                        boolean isChildHappy) throws InterruptedException;

    void onSchool(int amountOfMinutesToGetToSchool,
                  boolean isSecondarySchoolOfMathematics,
                  int averageMark) throws InterruptedException;

    void onUniversity(String establishmentName,
                      String specialization,
                      boolean isFreeEducation,
                      boolean isWorkWhileStudy) throws InterruptedException;

    void onFindingJob(double salary,
                      int amountOfInterviews,
                      int timeInMinutesFromWorkplace) throws InterruptedException;

    void onSeekingForWife(boolean isMotherLikes,
                          boolean isRich,
                          int herAge) throws InterruptedException;

    void onHavingKids(int kidsQuantity,
                      boolean gender) throws InterruptedException;

    void onStudyingJava(double cost,
                        boolean isOnlineCourse,
                        int amountOfMonthsToBecomeJunior) throws InterruptedException;

    void onRunningStartUp(boolean isDivorced,
                          boolean isSuccessful,
                          String lineOfBusiness,
                          String companyName) throws InterruptedException;

    void onSellingStartUp(double price,
                          boolean isEnoughMoneyToRetire,
                          boolean isHappyWithSpentEffortsAndTime) throws InterruptedException;

    void onDeath(boolean isWifeCame,
                 boolean isDiedFromAge,
                 String placeWhereHeDied,
                 int amountOfPeopleAtFuneral
                 ) throws InterruptedException;
}
