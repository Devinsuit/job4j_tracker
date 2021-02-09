package ru.job4j.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2.0;
    }

    public boolean exist(double ab, double bc, double ac) {
        return ((ab + bc > ac) && (bc + ac > ab) && (ab + ac > bc));
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double bc = second.distance(third);
        double ac = third.distance(first);
        double p = period(ab, bc, ac);
        if (exist(ab, bc, ac)) {
            rsl = Math.sqrt(p * (p - ac) * (p - bc) * (p - ac));
        }
        return rsl;
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        System.out.println(rsl);
    }

}

