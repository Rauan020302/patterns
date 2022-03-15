package com.company.singleton;

public class SingletonApp {
    public static void main(String[] args) throws InterruptedException {

        Singleton arr[] = new Singleton[1000];

        Thread t[] = new Thread[1000];

        for (int i = 0; i < 1000; i++) {
             t[i] = new Thread(new R());
             t[i].start();
        }
        for (int i = 0; i < 1000; i++) {
            t[i].join();
        }

        System.out.println(Singleton.counter);



    }
}
class R implements Runnable {
    @Override
    public void run() {
        Singleton.getInstance();
    }
}
class Singleton {
    public static int counter = 0;
    private static volatile Singleton instance = null;
    private Singleton(){
        counter++;
    }
    public static Singleton getInstance() {
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null)
                instance = new Singleton();
            }
        }
        return instance;
    }




//    public static synchronized Singleton getInstance() {
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//    public static Singleton getInstance() {
//        return instance;
//    }
//     public static Singleton getInstance() {
//        if (instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//     }
}