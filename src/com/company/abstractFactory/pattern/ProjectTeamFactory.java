package com.company.abstractFactory.pattern;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
