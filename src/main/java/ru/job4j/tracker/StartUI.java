package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {

        Item item = new Item("Igor", 1);
        System.out.println(item);
    }
}
