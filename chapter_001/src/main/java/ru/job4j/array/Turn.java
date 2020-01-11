package ru.job4j.array;

/**
 * Turn Располагает элементы массива в обратном порядке.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 11.01.2020
 */
public class Turn {

    /**
     * Переворачивание массива
     *
     * @param array - массив чисел
     * @return - массив наоборот
     */
    public int[] back(int[] array) {
        for (int index = 0; index < (array.length - 1 - index); index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = temp;
        }
        return array;
    }
}
