package com.company;

import java.time.LocalDateTime;

public interface IHumanObserver {
    void onBirth(LocalDateTime birthTime,
                 boolean gender,
                 float weight,
                 int height,
                 boolean location, int ageInYears) throws InterruptedException;

    void onKindergarten(Human.KindergartenParams params) throws InterruptedException;

    void onSchool(Human.SchoolStage params) throws InterruptedException;

    void onUniversity(Human.UniversityStage params) throws InterruptedException;

    void onFindingJob(Human.JobStage params) throws InterruptedException;

    void onSeekingForWife(Human.FindingWifeStage params) throws InterruptedException;

    void onHavingKids(Human.BabiesStage params) throws InterruptedException;

    void onStudyingJava(Human.JavaLearnStage params) throws InterruptedException;

    void onRunningStartUp(Human.StartUpStage params) throws InterruptedException;

    void onSellingStartUp(Human.SellStartUpStage params) throws InterruptedException;

    void onDeath(Human.DeathStage params) throws InterruptedException;
}
