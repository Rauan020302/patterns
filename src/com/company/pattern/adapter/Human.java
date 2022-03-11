package com.company.pattern.adapter;

public class Human {
    private String name;
    private String profession;
    private double strength;
    private static int humanPassword = 111;

    public Human(String name, String profession, double strength) {
        this.name = name;
        this.profession = profession;
        this.strength = strength;
    }

    public static int getHumanPassword() {
        return humanPassword;
    }

    public static void setHumanPassword(int humanPassword) {
        Human.humanPassword = humanPassword;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public double getStrength() {
        return strength;
    }

    public int tellMeTheHumanPassword(){
        return humanPassword;
    }

}
