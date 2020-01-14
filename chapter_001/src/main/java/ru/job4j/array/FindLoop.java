package ru.job4j.array;

/**
 * FindLoop Класс для поиска элемента методом перебора.
 *
 * @author Svetlana Kaptsova
 * @version 1.1
 * @since 11.01.2020
 */
public class FindLoop {

    /**
     * Поиск элемента в массиве
     *
     * @param data - массив чисел
     * @param el   - искомый элемент
     * @return - индекс элемента в массиве
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Поиск элемента в заданном диапазоне
     *
     * @param data   - массив чисел
     * @param el     - искомый элемент
     * @param start  - начало диапазона
     * @param finish - конец диапазона
     * @return - индекс элемента в массиве
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
