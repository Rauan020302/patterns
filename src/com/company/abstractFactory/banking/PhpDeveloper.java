package com.company.abstractFactory.banking;

import com.company.abstractFactory.pattern.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code");
    }
}
