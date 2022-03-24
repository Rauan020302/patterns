package com.company.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java","Spring","Hibernate","maven","PostgreSQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Rauan",skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer " + javaDeveloper.getName());
        System.out.println("skills: " );
        while(iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }


    }
}
