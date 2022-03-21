package com.company.abstractFactory.banking;

import com.company.abstractFactory.pattern.Developer;
import com.company.abstractFactory.pattern.ProjectManager;
import com.company.abstractFactory.pattern.ProjectTeamFactory;
import com.company.abstractFactory.pattern.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PM();
    }
}
