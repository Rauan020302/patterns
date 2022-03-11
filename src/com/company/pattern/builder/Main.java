package com.company.pattern.builder;

public class Main {
    public static void main(String[] args) {
        UnitBuilder unitBuilder = new UnitBuilder();
        unitBuilder.setName("Петр");
        unitBuilder.setWeapon("Палка");
        unitBuilder.getResult();

        unitBuilder.setDamage(6.0);
        unitBuilder.getResult();

        unitBuilder.setProfession("Бездельник");
        unitBuilder.getResult();
    }
}
