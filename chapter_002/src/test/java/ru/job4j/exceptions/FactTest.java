package ru.job4j.exceptions;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenArgumentLess0() {

        new Fact().calc(-3);
    }
}
