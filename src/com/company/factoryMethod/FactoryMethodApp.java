package com.company.factoryMethod;

import java.util.Date;

public class FactoryMethodApp {
    public static void main(String[] args) {
//        Watch watch = new DigitalWatch();
//        watch.showTime();
//        Watch watch1 = new RomeWatch();
//        watch1.showTime();

//        WatchMaker watchMaker = new DigitalWatchMaker();
//        Watch watch = watchMaker.createWatch();
//        watch.showTime();

        WatchMaker watchMaker = getMakerByName("Rome");
        Watch watch = watchMaker.createWatch();
        watch.showTime();

    }
    public static WatchMaker getMakerByName(String maker) {
        if (maker.equals("Digital"))
            return new DigitalWatchMaker();
        else if (maker.equals("Rome"))
            return new RomeWatchMaker();

        throw new RuntimeException("Не поддерживаемая производственная линия часов: " + maker);
    }
}
interface Watch{
    void showTime();
}

class DigitalWatch implements Watch{
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("VII-XX");
    }
}
interface WatchMaker{
    Watch createWatch();
}
class DigitalWatchMaker implements WatchMaker{
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
