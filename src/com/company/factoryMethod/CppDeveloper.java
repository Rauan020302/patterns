package com.company.factoryMethod;

import com.company.factoryMethod.pattern.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode(){
        System.out.println("C++ developer writes C++ code");
    }
}
