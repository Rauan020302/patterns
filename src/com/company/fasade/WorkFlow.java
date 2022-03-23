package com.company.fasade;

public class WorkFlow {
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();
    Developer developer = new Developer();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.DoJobBeforeDeadLine(bugTracker);
    }
}
