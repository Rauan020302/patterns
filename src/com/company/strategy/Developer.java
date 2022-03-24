package com.company.strategy;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void executeActivity() {
        activity.justDoIt();
    }

}
