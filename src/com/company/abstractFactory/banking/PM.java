package com.company.abstractFactory.banking;

import com.company.abstractFactory.pattern.ProjectManager;

public class PM implements ProjectManager {
    @Override
    public void manageProject(){
        System.out.println("PM manages website project");
    }
}
