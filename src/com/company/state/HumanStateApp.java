package com.company.state;

public class HumanStateApp {
    public static void main(String[] args) {
        Activity activity = new Relax();
        Human human = new Human();
        human.setState(activity);

        for (int i = 0; i < 10; i++) {
            human.doSomething();
        }
    }
}
class Human {
    private Activity state;
    public void setState(Activity state) {
        this.state = state;
    }
    public void doSomething() {
        state.doSomething(this);
    }
}
interface Activity {
    void doSomething(Human context);
}
class Work implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("Working!!!");
        context.setState(new Relax());
    }
}
class Relax implements Activity {
    private int count = 0;
    @Override
    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Relaxing!!!");
            count++;
        } else {
            context.setState(new Work());
        }
    }
}
