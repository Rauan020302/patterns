package com.company.factoryMethod;

import com.company.factoryMethod.pattern.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode(){
        System.out.println("Java developer writes java code");
    }
}
