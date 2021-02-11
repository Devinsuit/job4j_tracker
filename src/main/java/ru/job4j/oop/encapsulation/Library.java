package ru.job4j.oop.encapsulation;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Martin Eden", 500);
        Book book2 = new Book("Eugene Onegin", 300);
        Book book3 = new Book("Hero of our time", 200);
        Book book4 = new Book("Clean code", 700);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bookNumber = books[i];
            System.out.println("Book \"" + bookNumber.getName() + "\" has "
                    + bookNumber.getNumPage() + " pages.");
        }
        Book temp;
        temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book bookNumber = books[i];
            System.out.println("Book \"" + bookNumber.getName() + "\" has "
                    + bookNumber.getNumPage() + " pages.");
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println("Book number " + i + " has name \"Clean code\".");
            }
        }
    }
}
