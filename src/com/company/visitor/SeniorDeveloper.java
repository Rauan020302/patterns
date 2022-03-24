package com.company.visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("writing class after junior");
    }

    @Override
    public void create(Database database) {
        System.out.println("fixing database");
    }

    @Override
    public void create(Test test) {
        System.out.println("creating reliable test");
    }
}
