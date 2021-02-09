package ru.job4j.oop;



import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To3To7Then7() {
        int result = Max.max(5, 3, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax3To3To3To3Then3() {
        int result = Max.max(3, 3, 3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax3To6To9To12Then12() {
        int result = Max.max(3, 6, 9, 12);
        assertThat(result, is(12));
    }
}