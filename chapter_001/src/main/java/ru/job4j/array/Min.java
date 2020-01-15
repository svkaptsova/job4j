package ru.job4j.array;

/**
 * Min Class for searching minimal of numbers.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 14.01.2020
 */
public class Min {

    /**
     * Search min
     *
     * @param array - array
     * @return - minimal of elements
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
