package com.company.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String,Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty){
        Developer developer = developers.get(specialty);
        if (developer == null){
            switch (specialty){
                case("java"):
                    System.out.println("writing java developer...");
                    developer = new JavaDeveloper();
                    break;
                case("python"):
                    System.out.println("writing python developer...");
                    developer = new PythonDeveloper();
            }
            developers.put(specialty,developer);
        }
        return developer;
    }
}
