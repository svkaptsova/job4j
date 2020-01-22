package ru.job4j.calculator;

/**
 * Calculator Для произведения арифметических опреаций +-/*.
 *
 * @author Svetlana Kaptsova
 * @version 1.1
 * @since 10.01.2020
 */
public class Calculator {
    /**
     * Сложение
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     *               result сумма
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }

    /**
     * Деление
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     *               result частное
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }

    /**
     * Умножение
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     *               result произведение
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }

    /**
     * Вычитание
     *
     * @param first  первый аргумент
     * @param second второй аргумент
     *               result разность
     */
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

    /**
     * Main Точка входа в программу.
     *
     * @param args - args
     *             add складывает
     *             div делит
     *             multiply умножает
     *             subtract вычитает
     */
    public static void main(String[] args) {
        add(1, 1);
        add(2, 2);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
