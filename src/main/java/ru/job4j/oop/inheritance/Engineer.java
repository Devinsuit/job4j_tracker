package ru.job4j.oop.inheritance;

public class Engineer extends Profession {
    private String education;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void solveProblem() {

    }
}
