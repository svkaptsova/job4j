package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Point - Класс для вычисления растояния между двумя точками в системе координат.
 *
 * @author Svetlana Kaptsova
 * @version 1.1
 * @since 21.02.2020
 */
public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * @param that - точка с заданными координатами
     * @return расстояние между двумя точками
     */
    public double distance(Point that) {
        return sqrt(pow((that.x - this.x), 2) + pow((that.y - this.y), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(1, 3);
        Point b = new Point(4, 7);
        double result = a.distance(b);
        System.out.println("result (1, 3) to (4, 7) " + result);
    }
}
