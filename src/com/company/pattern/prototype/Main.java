package com.company.pattern.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototypeOriginal = new Prototype("Кентавр", "рыбак", "Петя");
        Prototype prototypeClone = (Prototype)prototypeOriginal.clone();
        prototypeClone.setName("КлонПети");

        System.out.println(prototypeOriginal.toString());
        System.out.println("Кентавра клонировали и изменили имя!");
        System.out.println(prototypeClone.toString());

    }
}
