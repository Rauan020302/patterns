package com.company.pattern.adapter;

public class HumanToOrcBaracksAdapter extends Orc{
    private Human human;

    public HumanToOrcBaracksAdapter(Human human) {
        this.human = human;
    }

    @Override
    public int tellMeTheOrcPassword() {
        return super.tellMeTheOrcPassword();
    }

}
