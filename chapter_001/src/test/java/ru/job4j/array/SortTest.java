package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortTest {

    @Test
    public void whenSortArrayOfFourElementsThenSortedArray() {
        assertThat(Sort.sortSel(new int[]{4, 7, 3, 80}), is(new int[]{3, 4, 7, 80}));
    }

    @Test
    public void whenSortArrayOfSevenElementsThenSortedArray() {
        assertThat(Sort.sortSel(new int[]{44, 8, 4, -4, 25, 1, 0}), is(new int[]{-4, 0, 1, 4, 8, 25, 44}));
    }
}

