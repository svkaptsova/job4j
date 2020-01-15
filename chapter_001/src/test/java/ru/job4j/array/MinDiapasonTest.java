package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat(MinDiapason.findMin(new int[]{-1, 0, 5, 10}, 1, 3), is(0));
    }

    @Test
    public void whenLastMin() {
        assertThat(MinDiapason.findMin(new int[]{8, 3, 4, 1}, 1, 3), is(1));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(MinDiapason.findMin(new int[]{4, -3, 17, 8}, 0, 2), is(-3));
    }
}
