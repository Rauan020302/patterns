package com.company.pattern.prototype;

public class Prototype implements Cloneable{
    private String race;
    private String profession;
    private String name;

    public Prototype(String race, String profession, String name) {
        this.race = race;
        this.profession = profession;
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public String getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "race='" + race + '\'' +
                ", profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
