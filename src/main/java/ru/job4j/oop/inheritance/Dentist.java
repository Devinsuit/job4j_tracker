package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, String birthday,
                   boolean residency, int experience) {
        super(name, surname, education, birthday, residency, experience);
    }
}
