package com.company.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo gitHubRepo = new GitHubRepo();

        System.out.println("Creating new project. version 1.0");
        project.setVersionAndDate("version 1.0");

        System.out.println(project);

        System.out.println("saving current version to gitHub");
        gitHubRepo.setSave(project.save());

        System.out.println("updating project to version 1.1");
        Thread.sleep(5000);
        System.out.println("writing poor code...");

        project.setVersionAndDate("version 1.1");
        System.out.println(project);

        System.out.println("something went wrong...");

        System.out.println("rolling back to version 1.0");
        project.load(gitHubRepo.getSave());

        System.out.println("project after rollback");
        System.out.println(project);
    }
}
