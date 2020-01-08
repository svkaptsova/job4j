package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5Then3() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11Then5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2Then1() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(2);
        assertThat(count, is(1));
    }

    @Test
    public void when1Then0() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(1);
        assertThat(count, is(0));
    }
}
