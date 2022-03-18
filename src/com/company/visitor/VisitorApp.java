package com.company.visitor;

public class VisitorApp {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor hooligane = new HooliganVisitor();
        body.accept(hooligane);
        engine.accept(hooligane);
    }
}
interface Visitor{
    void visit(EngineElement engine);
    void visit(BodyElement body);
}
interface Element{
    void accept(Visitor visitor);
}
class EngineElement implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class BodyElement implements Element{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class HooliganVisitor implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Завел двигатель");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Постучал по корпусу");
    }
}
class MechanicVisitor implements Visitor{
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Проверил двигатель");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Отполировал кузов");
    }
}