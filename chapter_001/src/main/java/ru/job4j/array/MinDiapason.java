package ru.job4j.array;

/**
 * MinDiapason Класс для поиска минимума в диапазоне.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 15.01.2020
 */
public class MinDiapason {

    /**
     * Поиск минимума в диапазоне
     *
     * @param array  - массив
     * @param start  - начало диапазона
     * @param finish - конец диапазона
     * @return - минимальное число в заданном диапазоне
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = (start + 1); index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
