package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Point - Класс для вычисления растояния между двумя точками в системе координат.
 *
 * @author Svetlana Kaptsova
 * @version 1.2
 * @since 1.0
 */
public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /**
     * @param that - точка с заданными координатами
     * @return расстояние между двумя точками
     */
    public double distance(Point that) {
        return sqrt(pow((that.x - this.x), 2) + pow((that.y - this.y), 2));
    }

    /**
     * @param some - точка с заданными координатами в трехмерном пространсве
     * @return расстояние между двумя точками
     */
    public double distance3d(Point some) {
        return sqrt(pow((some.x - this.x), 2) + pow((some.y - this.y), 2) + pow((some.z - this.z), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(1, 3);
        Point b = new Point(4, 7);
        Point c = new Point(7, 5, 7);
        Point d = new Point(8, 7, 11);
        double result = a.distance(b);
        System.out.println("result (1, 3) to (4, 7) " + result);
        double result3d = c.distance3d(d);
        System.out.println("result (7, 5, 7) to (8, 7, 11) " + result3d);
    }
}
