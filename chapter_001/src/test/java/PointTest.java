package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
        @Test
        public void whenPutForPoint1CoordinatesX1Y3AndForPoint2CoordinatesX3Y7ThenGet5() {
            int inx1 = 1;
            int iny1 = 3;
            int inx2 = 4;
            int iny2 = 7;
            int expected = 5;
            double out = Point.distance(inx1, iny1, inx2, iny2);
            Assert.assertEquals(expected, out, 0.01);
        }
}
