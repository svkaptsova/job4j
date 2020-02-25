package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void whenPut34Then7() {
        Calculator two = new Calculator();
        assertThat(two.add(3, 4), is(7));
    }

    @Test
    public void whenPut347Then14() {
        Calculator three = new Calculator();
        assertThat(three.add(3, 4, 7), is(14));

    }

    @Test
    public void whenPut3478Then22() {
        Calculator four = new Calculator();
        assertThat(four.add(3, 4, 7, 8), is(22));
    }
}
