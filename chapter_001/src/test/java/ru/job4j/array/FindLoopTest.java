package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas3Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{5, 10, 3};
        int value = 3;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas35ThenNot() {
        FindLoop find = new FindLoop();
        int[] input = new int[]{4, 8, 25};
        int value = 35;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind34TheNot() {
        int[] input = new int[]{3, 1, 8, 7, 4};
        int value = 34;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind7Then3() {
        int[] input = new int[]{1, 4, 35, 7, 8};
        int value = 7;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortArrayOfThreeElementsThenSortedArray() {
        assertThat(FindLoop.sortSelected(new int[] {8,3,71}), is(new int[] {3,8,71}));
    }

    @Test
    public void whenSortArrayOfFiveElementsThenSortedArray() {
        assertThat(FindLoop.sortSelected(new int[] {3,4,-1, 25,1}), is(new int[] {-1,1,3,4,25}));
    }

}
