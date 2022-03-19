package com.company.bridge;

public class BridgeApp {
    public static void main(String[] args) {
        Car car1 = new Sedan(new Kia());
        Car car2 = new Sedan(new Skoda());
        Car car3 = new Hatchback(new Kia());
        car1.showDetails();
        car2.showDetails();
        car3.showDetails();
    }
}
abstract class Car{
    Make make;
    public Car(Make make) {
        this.make = make;
    }
    void showDetails(){
        print();
        make.setMake();
    }
    abstract void print();

}
class Sedan extends Car{
    public Sedan(Make make) {
        super(make);
    }

    @Override
    void print() {
        System.out.print("Sedan ");
    }
}
class Hatchback extends Car{
    public Hatchback(Make make) {
        super(make);
    }

    @Override
    void print() {
        System.out.print("Hatchback ");
    }
}
interface Make{
    void setMake();
}
class Kia implements Make {
    @Override
    public void setMake() {
        System.out.println("Kia");
    }
}
class Skoda implements Make{
    @Override
    public void setMake() {
        System.out.println("Skoda");
    }
}