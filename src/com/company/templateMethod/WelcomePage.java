package com.company.templateMethod;

public class WelcomePage extends WebsiteTemplate{
    @Override
    public void showContent() {
        System.out.println("Welcome");
    }
}
