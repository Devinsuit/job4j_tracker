package ru.job4j.oop;

public class Cat {
    public String sound() {
        String voice = "mau - mau";
        return voice;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says: " + say);

    }
}