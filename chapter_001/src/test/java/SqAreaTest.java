package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void whenPutP8K4ThenGet256() {
        double inP = 8;
        double inK = 4;
        double expected = 2.56;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
}
