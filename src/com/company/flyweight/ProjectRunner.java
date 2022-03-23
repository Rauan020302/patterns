package com.company.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();
        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("python"));
        developers.add(developerFactory.getDeveloperBySpecialty("python"));
        developers.add(developerFactory.getDeveloperBySpecialty("python"));
        developers.add(developerFactory.getDeveloperBySpecialty("python"));

        for (Developer developer: developers){
            developer.writeCode();
        }
    }
}
