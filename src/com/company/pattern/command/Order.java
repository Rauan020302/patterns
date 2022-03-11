package com.company.pattern.command;

public abstract class Order {
    String objectOrder = null;
    String actionWithObject = null;

    public abstract void executeOrder();
    public abstract void undoOrder();
}
