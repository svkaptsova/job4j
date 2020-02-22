package ru.job4j.condition;

        import org.junit.Assert;
        import org.junit.Test;

public class PointTest {
    @Test
    public void whenPutForPointACoordinatesX1Y3AndForPointBCoordinatesX3Y7ThenGet5() {
        Point a = new Point(1, 3);
        Point b = new Point(4, 7);
        int expected = 5;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenPutForPointACoordinatesX8Y5Z7AndForPointBCoordinatesX57Y30ThenGet8() {
        Point c = new Point(7, 5, 7);
        Point d = new Point(8, 7, 11);
        Assert.assertEquals(4.58, c.distance3d(d), 0.01);
    }
}
