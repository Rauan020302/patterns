package com.company.factoryMethod;

import com.company.factoryMethod.pattern.Developer;
import com.company.factoryMethod.pattern.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
