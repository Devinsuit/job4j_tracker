package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }
}
