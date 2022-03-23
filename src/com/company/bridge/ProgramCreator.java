package com.company.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
            new BankSystem(new JavaDeveloper()),
            new StockExchange(new PhpDeveloper())
        };

        for (Program program: programs){
            program.developProgram();
        }
    }
}
