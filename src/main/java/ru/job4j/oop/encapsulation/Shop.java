package ru.job4j.oop.encapsulation;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int number = -1;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                number = i;
                break;
            }
        }
    return number;
    }
}
