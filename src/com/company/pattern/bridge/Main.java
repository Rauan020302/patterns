package com.company.pattern.bridge;

import com.company.pattern.bridge.attack.Archer;
import com.company.pattern.bridge.attack.Crusher;
import com.company.pattern.bridge.attack.Mage;
import com.company.pattern.bridge.attack.Warrior;
import com.company.pattern.bridge.race.Human;
import com.company.pattern.bridge.race.NightElf;
import com.company.pattern.bridge.race.Orc;
import com.company.pattern.bridge.race.Undead;

public class Main {
    public static void main(String[] args) {
        Orc orc = new Orc("Борис", new Crusher());
        Human human = new Human("Святослав", new Warrior());
        Undead undead = new Undead("Гога", new Mage());
        NightElf nightElf = new NightElf("Леголас", new Archer());

        orc.attack();
        human.attack();
        undead.attack();
        nightElf.attack();
    }
}
