package ru.job4j.array;

/**
 * Square Класс для заполнения массива числами, возведенными в степень 2.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 10.01.2020
 */
public class Square {

    /**
     * Возведение в квадрат элементов массива
     *
     * @param bound - размер массива
     * @return - массив чисел, возведенных в квадрат
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int element = 1; element <= bound; element++) {
            rst[element - 1] = element * element;
        }
        return rst;
    }
}
