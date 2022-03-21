package com.company.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"SuperProject","SourceCode");
        System.out.println(master);

//        Project masterClone = (Project) master.copy();
//        System.out.println(masterClone);
        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println(masterClone);

    }
}
