package com.company.pattern.adapter;

public class Orc {
    private String name;
    private String profession;
    private double strength;
    private static int orcPassword = 666;

    public Orc(String name, String profession, double strength) {
        this.name = name;
        this.profession = profession;
        this.strength = strength;
    }

    public Orc() {
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

    public void setOrcPassword(int orcPassword) {
        this.orcPassword = orcPassword;
    }

    public int tellMeTheOrcPassword(){
        return orcPassword;
    }

}
