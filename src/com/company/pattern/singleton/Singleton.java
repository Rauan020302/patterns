package com.company.pattern.singleton;

public class Singleton {
    private String race;
    private String profession;
    private String name;
    private static Singleton instance;

    public void setRace(String race) {
        this.race = race;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Singleton(String race, String profession, String name) {
        this.race = race;
        this.profession = profession;
        this.name = name;
    }

    public static Singleton getInstance(String race, String profession, String name) {
        if (instance == null){
            instance = new Singleton(race,profession,name);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "race='" + race + '\'' +
                ", profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
