package com.company.bridge;

public class StockExchange extends Program{
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("stock exchange development in progress");
        developer.writeCode();
    }
}
