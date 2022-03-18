package com.company.state;

public class StateApp {
    public static void main(String[] args) {
        Station station1 = new Radio7();
        Radio radio = new Radio();
        radio.setStation(station1);
        for (int i = 0; i < 10; i++) {
            radio.nextStation();
            radio.play();
        }

    }
}
interface Station {
    void play();
}
class Radio7 implements Station {
    @Override
    public void play() {
        System.out.println("Radio 7 ...");
    }
}
class RadioDFM implements Station {
    @Override
    public void play() {
        System.out.println("Radio DFM ...");
    }
}
class RadioFM implements Station {
    @Override
    public void play() {
        System.out.println("Radio FM ...");
    }
}
class Radio {
    Station station;

    void setStation(Station st) {
        station = st;
    }
    void nextStation(){
        if (station instanceof Radio7){
            setStation(new RadioDFM());
        }else if (station instanceof RadioDFM){
            setStation(new RadioFM());
        }else if (station instanceof RadioFM){
            setStation(new Radio7());
        }
    }
    void play(){
        station.play();
    }
}
