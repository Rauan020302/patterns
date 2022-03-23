package com.company.fasade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }
    public void startSprint(){
        System.out.println("spring is active");
        activeSprint = true;
    }
    public void finishSprint(){
        System.out.println("spring is not active");
        activeSprint = false;
    }
}
