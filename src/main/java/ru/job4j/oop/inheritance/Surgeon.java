package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, String birthday,
                   boolean residency, int experience) {
        super(name, surname, education, birthday, residency, experience);
    }

    public boolean appendixRemoved() {
        return true;

    }
}
