package ru.job4j.oop.patterns.strategy;
import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenDrawTriangle() {
        Triangle trgl = new Triangle();
        assertThat(trgl.draw(), is(new StringJoiner(System.lineSeparator())
                .add("  .")
                .add(" ...")
                .add(".....")
                .add(" ")
                .toString()));
    }
}

