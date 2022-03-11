package com.company.pattern.builder;

public class UnitBuilder {
    private String race;
    private String profession;
    private String weapon;
    private double strength;
    private double speed;
    private double damage;
    private String name;

    public void setRace(String race) {
        this.race = race;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit getResult(){
        return new Unit(race,profession,weapon,strength,speed,damage,name);
    }
}
