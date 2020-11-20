package ru.job4j.collection;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ConvertMatrix2ListTest {
    @Test
    public void when4on2ArrayThenList8() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}
