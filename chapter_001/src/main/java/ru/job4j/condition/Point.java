package ru.job4j.condition;

/**
 * @author Kaptsova Svetlana (kaptsulka@mail.ru)
 * @version 1.0
 * @since 0.2
 */

/**
 * Растояния между двумя точками в системе координат.
 * @return distance between two point.
 */

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x3 = x2 - x1;
        double y3 = y2 - y1;
        double first = Math.pow(x3, 2);
        double second = Math.pow(y3, 2);
        double a = first + second;
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        double result = distance(1, 3, 4, 7);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
