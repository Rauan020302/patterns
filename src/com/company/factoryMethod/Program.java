package com.company.factoryMethod;

import com.company.factoryMethod.pattern.Developer;
import com.company.factoryMethod.pattern.DeveloperFactory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("c++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }
    static DeveloperFactory createDeveloperBySpecialty(String specialty){
        if (specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }
        else if(specialty.equalsIgnoreCase("C++")){
            return new CppDeveloperFactory();
        }else{
            throw new RuntimeException(specialty + " is unknown");
        }
    }
}
