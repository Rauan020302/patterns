package com.company.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ObserverApp {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();
        ConsoleObserver c = new ConsoleObserver();
        station.addObserver(c);

        station.setMeasurements(25,750);
        station.removeObserver(c);
        station.setMeasurements(15,650);

        station.addObserver(new FileObserver());
        station.setMeasurements(21,12);


    }
}
interface Observed{
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
class MeteoStation implements Observed{
    int temperature;
    int pressure;
    List<Observer> observers = new ArrayList<>();

    public void setMeasurements(int t,int p){
        temperature=t;
        pressure=p;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObserver() {
        for (Observer o: observers) {
            o.handleEvent(temperature,pressure);
        }
    }
}
interface Observer{
    void handleEvent(int temp,int presser);
}

class ConsoleObserver implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("Погода изменилась Console. Температура - "
                + temp + ", давление - " + presser + ".");
    }
}
class FileObserver implements Observer{
    @Override
    public void handleEvent(int temp, int presser) {
        File f;
        try{
            f= File.createTempFile("TempPressure","_txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("Погода изменилась FILE. Температура - "
                    + temp + ", давление - " + presser + ".");
            pw.println();
            pw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
