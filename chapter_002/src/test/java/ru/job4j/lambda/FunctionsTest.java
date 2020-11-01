package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class FunctionsTest {
    @Test
    public void whenLinerFunction() {
        Functions functions = new Functions();
        List<Double> result = functions.diapason(1, 3, x -> 4 * x);
        List<Double> expected = Arrays.asList(4D, 8D, 12D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadroFunction() {
        Functions functions = new Functions();
        List<Double> result = functions.diapason(1, 3, x -> x * x);
        List<Double> expected = Arrays.asList(1D, 4D, 9D);
        assertThat(result, is(expected));
    }
}

