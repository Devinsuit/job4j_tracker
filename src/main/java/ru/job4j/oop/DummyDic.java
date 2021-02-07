package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = "Неизвестное слово. " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic translator = new DummyDic();
        String phrase = "Unknown word";
        System.out.println(translator.engToRus(phrase));

    }
}
