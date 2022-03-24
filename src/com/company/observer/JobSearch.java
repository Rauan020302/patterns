package com.company.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First Java position");
        jobSite.addVacancy("Second Java position");
        jobSite.addVacancy("Third Java position");
        Observer firstSubscriber = new Subscriber("Rauan");
        Observer secondSubscriber = new Subscriber("John");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Fourth Java position");
        jobSite.removeObserver(secondSubscriber);
        jobSite.removeVacancy("Third Java position");

    }
}
