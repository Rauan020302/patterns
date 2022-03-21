package com.company.abstractFactory.banking;

import com.company.abstractFactory.pattern.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("tester writes test code");
    }
}
