package ru.job4j.oop.encapsulation;

public class Book {
    private String name;
    private int numPage;

    public Book(String name, int numPage) {
        this.name = name;
        this.numPage = numPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumPage() {
        return numPage;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }
}
