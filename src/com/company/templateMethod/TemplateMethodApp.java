package com.company.templateMethod;

public class TemplateMethodApp {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.templateMethod();
        b.templateMethod();
    }
}
abstract class C{
    void templateMethod() {
        System.out.println("1");
        differ();
        System.out.println("3");
        differ2();
    }
    abstract void differ();
    abstract void differ2();
}
class A extends C{
    @Override
    void differ() {
        System.out.println("2");
    }

    @Override
    void differ2() {
        System.out.println("6");
    }
}
class B extends C{
    @Override
    void differ() {
        System.out.println("4");
    }

    @Override
    void differ2() {
        System.out.println("5");
    }
}
