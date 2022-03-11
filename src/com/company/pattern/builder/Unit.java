package com.company.pattern.builder;

public class Unit {
    private String race;
    private String profession;
    private String weapon;
    private double strength;
    private double speed;
    private double damage;
    private String name;

    public Unit(String race, String profession, String weapon, double strength, double speed, double damage, String name) {
        this.race = race;
        this.profession = profession;
        this.weapon = weapon;
        this.strength = strength;
        this.speed = speed;
        this.damage = damage;
        this.name = name;

        System.out.println(this.toString());
    }

    public String getRace() {
        return race;
    }

    public String getProfession() {
        return profession;
    }

    public String getWeapon() {
        return weapon;
    }

    public double getStrength() {
        return strength;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "race='" + race + '\'' +
                ", profession='" + profession + '\'' +
                ", weapon='" + weapon + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                ", damage=" + damage +
                ", name='" + name + '\'' +
                '}';
    }
}
