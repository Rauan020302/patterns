package com.company.builder;

public class BuilderApp {
    public static void main(String[] args) {
//        Car car = new CarBuilder()
//                .builderMake("Mercedes")
//                .builderSpeed(250)
//                .builderTransmission(Transmission.AUTO).build();
//        System.out.println(car);

        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());
        Car car = director.buildCar();
        System.out.println(car);


    }
}

enum Transmission{
    MANUAL,AUTO
}
class Car{
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

abstract class CarBuilder{
    Car car;
    void createCar() {
        car = new Car();
    }
    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();
    Car getCar() {
        return car;
    }
}
class FordMondeoBuilder extends CarBuilder {
    @Override
    void buildMake() {
        car.setMake("Ford Mondeo");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(220);
    }
}
class SubaruBuilder extends CarBuilder{
    @Override
    void buildMake() {
        car.setMake("Subaru");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
class Director{
    CarBuilder builder;
    void setBuilder(CarBuilder b){
        builder = b;
    }
    Car buildCar() {
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}

//class CarBuilder{
//    String m = "Defauld";
//    Transmission t = Transmission.MANUAL;
//    int s = 120;
//
//    CarBuilder builderMake(String m){
//        this.m = m;
//        return this;
//    }
//    CarBuilder builderTransmission(Transmission t){
//        this.t = t;
//        return this;
//    }
//    CarBuilder builderSpeed(int s){
//        this.s = s;
//        return this;
//    }
//    Car build() {
//        Car car = new Car();
//        car.setMake(m);
//        car.setTransmission(t);
//        car.setMaxSpeed(s);
//        return car;
//    }
//
//}