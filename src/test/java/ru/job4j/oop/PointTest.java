package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(5, 4);
        Point b = new Point(1, 7);
        double dist = a.distance(b);
        System.out.println(dist);
        assertThat(dist, closeTo(5, 0.001));
    }

    @Test
    public void distance3d() {
        Point c = new Point(5, 4, 1);
        Point d = new Point(1, 7, 1);
        double distance = c.distance(d);
        System.out.println(distance);
        assertThat(distance, closeTo(5, 0.001));
    }
}