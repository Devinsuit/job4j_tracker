package ru.job4j.oop.encapsulation;

public class Student {
    private String name;
    private int group;
    private String dateAdmission;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(String dateAdmission) {
        this.dateAdmission = dateAdmission;
    }
}
