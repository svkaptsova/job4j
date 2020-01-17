package ru.job4j.array;

/**
 * Sort Класс для сортировки элементов массива по возрастанию.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 16.01.2020
 */
public class Sort {

    /**
     * Упорядочение элементов массива по возрастанию
     * (альтернатива метода FindLoop.sortSelected)
     *
     * @param data - массив чисел
     * @return - упорядоченный массив
     */
    public static int[] sortSel(int[] data) {
        for (int i = 0; i < (data.length - 1); i++) {
            for (int j = (i + 1); j < data.length; j++) {
                if (data[j] < data[i]) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        return data;
    }
}
