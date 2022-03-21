package com.company.abstractFactory;

import com.company.abstractFactory.banking.BankingTeamFactory;
import com.company.abstractFactory.banking.ManualTester;
import com.company.abstractFactory.banking.PM;
import com.company.abstractFactory.banking.PhpDeveloper;
import com.company.abstractFactory.pattern.Developer;
import com.company.abstractFactory.pattern.ProjectManager;
import com.company.abstractFactory.pattern.ProjectTeamFactory;
import com.company.abstractFactory.pattern.Tester;

public class WebsiteProject {
    public static void main(String[] args) {
//        PhpDeveloper phpDeveloper = new PhpDeveloper();
//        ManualTester manualTester = new ManualTester();
//        PM projectManager = new PM();
//
//        System.out.println("creating project...");
//        phpDeveloper.writeCode();
//        manualTester.testCode();
//        projectManager.manageProject();
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
