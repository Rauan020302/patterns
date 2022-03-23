package com.company.fasade;

public class Developer {
    public void DoJobBeforeDeadLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("developer is solving problem...");

        }else{
            System.out.println("developer is reading Habrhabr...");
        }
    }
}
