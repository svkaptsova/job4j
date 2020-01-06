package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;


public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int inStart = 1;
        int inFinish = 10;
        int expected = 30;
        int out = Counter.add(inStart, inFinish);
        Assert.assertThat(out, is(expected));
    }
}


