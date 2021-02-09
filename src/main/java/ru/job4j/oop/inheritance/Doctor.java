package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private boolean residency;
    private int experience;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public boolean breakTaken() {
        return true;
    }

}
