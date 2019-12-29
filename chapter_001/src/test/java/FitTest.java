package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void whenPutForMan16174ThenGet71() {
        double in = 161.74;
        int expected = 71;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPutForWoman15609ThenGet53() {
        double in = 156.0869565;
        int expected = 53;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.1);
    }

}
