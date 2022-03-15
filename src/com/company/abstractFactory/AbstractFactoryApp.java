package com.company.abstractFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {
        DeviceFactory factory = getFactoryByCountryCode("EN");
        Mouse m = factory.getMouse();
        KeyBoard k = factory.getKeyBoard();
        Touchpad t = factory.getTouchpad();

        m.click();
        k.print();
        k.printLn();
        t.track(30,30);

    }
    private static DeviceFactory getFactoryByCountryCode(String lang){
        switch (lang){
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new RuntimeException("Unsupported Country code: " + lang);
        }
    }
}
interface Mouse{
    void click();
    void dblclick();
    void scroll(int direction);
}
interface KeyBoard{
    void print();
    void printLn();
}
interface Touchpad{
    void track(int deltaX, int deltaY);
}

interface DeviceFactory{
    Mouse getMouse();
    KeyBoard getKeyBoard();
    Touchpad getTouchpad();
}

class EnMouse implements Mouse{
    @Override
    public void click() {System.out.println("Mouse click");}
    @Override
    public void dblclick() {System.out.println("Mouse double click");}

    @Override
    public void scroll(int direction) {
        if (direction>0){
            System.out.println("Scroll Up");
        }else if (direction<0){
            System.out.println("Scroll Down");
        }else{
            System.out.println("No scrolling");
        }
    }
}
class EnKeyBoard implements KeyBoard{
    @Override
    public void print() {System.out.println("Print");
    }
    @Override
    public void printLn() {System.out.println("print line");
    }
}
class EnTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));
        System.out.println("Moved " + s + " pixels");
    }
}
class RuMouse implements Mouse{
    @Override
    public void click() {System.out.println("Щелчок мышью");}
    @Override
    public void dblclick() {System.out.println("Двойной щелчок мышью");}

    @Override
    public void scroll(int direction) {
        if (direction>0){
            System.out.println("Скролим вверх");
        }else if (direction<0){
            System.out.println("Скролим вниз");
        }else{
            System.out.println("не скролим");
        }
    }
}
class RuKeyBoard implements KeyBoard{
    @Override
    public void print() {System.out.println("печатаем строку");
    }
    @Override
    public void printLn() {System.out.println("печатаем строку на новой строке");
    }
}
class RuTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltaX,2)+Math.pow(deltaY,2));
        System.out.println("двигаемся на " + s + " пикселей");
    }
}
class EnDeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public KeyBoard getKeyBoard() {
        return new EnKeyBoard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
class RuDeviceFactory implements DeviceFactory{
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public KeyBoard getKeyBoard() {
        return new RuKeyBoard();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}

