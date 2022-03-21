package com.company.abstractFactory.banking;

import com.company.abstractFactory.pattern.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
