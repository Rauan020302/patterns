package com.company.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstDeveloper = new JavaDeveloper();
        Developer secondDeveloper = new FrontDeveloper();
        Developer thirdDeveloper = new JavaDeveloper();
        team.addDeveloper(firstDeveloper);
        team.addDeveloper(secondDeveloper);
        team.addDeveloper(thirdDeveloper);

        team.createProject();
    }
}
