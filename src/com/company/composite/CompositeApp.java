package com.company.composite;

import java.util.ArrayList;
import java.util.List;
public class CompositeApp {
    public static void main(String[] args) {
        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape circle1 = new Circle();
        Shape circle2 = new Circle();
        Shape circle3 = new Circle();
        Shape triangle1 = new Triangle();
        Shape triangle2 = new Triangle();
        Shape triangle3 = new Triangle();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        composite1.addComponents(square1);
        composite1.addComponents(circle1);
        composite1.addComponents(circle2);
        composite1.addComponents(triangle1);

        composite2.addComponents(square2);
        composite2.addComponents(circle3);
        composite2.addComponents(triangle2);
        composite2.addComponents(triangle3);

        composite3.addComponents(composite1);
        composite3.addComponents(composite2);
        composite3.draw();
    }
}
interface Shape{
    void draw();
}
class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Hi I'm square");
    }
}
class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Hi I'm triangle");
    }
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Hi I'm circle");
    }
}
class Composite implements Shape{
    private List<Shape> components = new ArrayList<>();

    public void addComponents(Shape shape){
        components.add(shape);
    }
    public void removeComponents(Shape shape){
        components.remove(shape);
    }
    @Override
    public void draw() {
        for (Shape component: components) {
            component.draw();
        }
    }
}