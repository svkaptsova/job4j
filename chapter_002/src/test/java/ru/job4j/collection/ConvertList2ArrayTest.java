package ru.job4j.collection;

import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConvertList2ArrayTest {
    @Test
    public void when13ElementsThen15() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 0, 0}
        };
        assertThat(result, is(expect));
    }
}
