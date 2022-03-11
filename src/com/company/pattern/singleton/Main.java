package com.company.pattern.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("opk","Скаут","Социальный");
        Singleton singleton2 = Singleton.getInstance("opk","Скаут","Социальный");

        System.out.println(singleton1);
        System.out.println(singleton2);

        System.out.println("Изменили имя по ссылке singleton1");
        singleton1.setName("одиночка");

        System.out.println(singleton1);
        System.out.println(singleton2);
        //"А имя изменилось у объекта по ссылке unit1 и по ссылке unit2"
        //"Похоже ссылки unit1 и unit2 ссылаются на один объект.."

        System.out.println("Изменили профессию по ссылке singleton2");
        singleton2.setProfession("Военный");
        System.out.println(singleton1);
        System.out.println(singleton2);



    }
}
