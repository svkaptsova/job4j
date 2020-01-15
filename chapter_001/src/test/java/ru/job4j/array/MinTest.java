package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] input = new int[]{1, 3, 4};
        int result = Min.findMin(input);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenLastMin() {
        int[] input = new int[]{8, 13, 4};
        int result = Min.findMin(input);
        int expect = 4;
        assertThat(result, is(expect));
    }

    @Test
    public void whenMiddleMin() {
        int[] input = new int[]{17, 3, 4};
        int result = Min.findMin(input);
        int expect = 3;
        assertThat(result, is(expect));
    }
}
