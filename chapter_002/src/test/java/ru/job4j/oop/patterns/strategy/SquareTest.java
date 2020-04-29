package ru.job4j.oop.patterns.strategy;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenDrawSquare() {
        Square sqr = new Square();
        assertThat(sqr.draw(), is(new StringJoiner(System.lineSeparator())
                        .add(".  .  .  .")
                        .add(".        .")
                        .add(".        .")
                        .add(".  .  .  .")
                        .toString()));
    }
}
