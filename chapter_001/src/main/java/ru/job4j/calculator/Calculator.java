package ru.job4j.calculator;

/**
 * Calculator Для произведения арифметических опреаций +-/*.
 *
 * @author Svetlana Kaptsova
 * @version 1.1
 * @since 22.01.2020
 */
public class Calculator {
    /**
     * Сложение
     *
     * @param first первый аргумент
     * @param second второй аргумент
     * @return сумма
     */
    public int add(int first, int second) {
        return first + second;
    }

    public int add(int first, int second, int third) {
        return add(add(first, second), third);
    }

    public int add(int first, int second, int third, int fourth) {
        return add(add(first, second, third), fourth);
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
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
