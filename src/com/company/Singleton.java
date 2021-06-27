package com.company;

public class Singleton {
    private volatile static Singleton uniqueInstance;
    //volatile гарантирует что паралельные программные потоки будут правильно работать
    // с переменной uniqueInstance при ее инициализации экземпляром Singleton
    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
