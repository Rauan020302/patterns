package com.company.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEE = getJavaEEExpression();

        System.out.println("Does developer knows java core: " + isJava.interpret("Java core"));
        System.out.println("Does developer knows java EE: " + isJavaEE.interpret("Java Spring"));
    }
    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java core");

        return new OrExpression(java,javaCore);
    }
    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new AndExpression(java,spring);
    }
}
