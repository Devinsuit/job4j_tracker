package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int center) {
        int temp = max(left, right);
        return max(temp, center);
    }

    public static int max(int a, int b, int c, int d) {
        int temp = max(a, b);
        int temp2 = max(c, d);
        return max(temp, temp2);
    }
}
