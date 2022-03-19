package com.company.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        PrinterInterface printer = new LeftBrachetDecorator(
                new RightBrachetDecorator(new QuotesDecorator(new Printer("Привет"))));
        printer.print();
    }
}
interface PrinterInterface{
    void print();
}
class Printer implements PrinterInterface{
    String value;
    public Printer(String value) {
        this.value = value;
    }
    @Override
    public void print() {
        System.out.print(value);
    }
}
abstract class Decorator implements PrinterInterface{
    PrinterInterface component;
    public Decorator(PrinterInterface component) {
        this.component = component;
    }
}
class QuotesDecorator extends Decorator{
    public QuotesDecorator(PrinterInterface component) {
        super(component);
    }
    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
class LeftBrachetDecorator extends Decorator{
    public LeftBrachetDecorator(PrinterInterface component) {
        super(component);
    }
    @Override
    public void print() {
        System.out.print("(");
        component.print();
    }
}
class RightBrachetDecorator extends Decorator{
    public RightBrachetDecorator(PrinterInterface component) {
        super(component);
    }
    @Override
    public void print() {
        component.print();
        System.out.print(")");
    }
}