package ru.job4j.array;

/**
 * Matrix Класс для заполнения двумерного массива.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 17.01.2020
 */

public class Matrix {

    /**
     * Заполнение массива таблицей умножения
     *
     * @param size - размер таблицы
     * @return - заполненный массив
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
