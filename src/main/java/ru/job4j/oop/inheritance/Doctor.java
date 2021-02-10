package ru.job4j.oop.inheritance;

public class Doctor extends Profession {
    private boolean residency;
    private int experience;

    public Doctor(String name, String surname, String education, String birthday,
                  boolean residency, int experience) {
        super(name, surname, education, birthday);
        this.residency = residency;
        this.experience = experience;
    }

    public boolean breakTaken() {
        return true;
    }

}
