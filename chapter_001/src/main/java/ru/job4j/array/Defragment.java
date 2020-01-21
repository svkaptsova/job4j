package ru.job4j.array;

/**
 * Defragment Класс для дефрагментации массива.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 21.01.2020
 */
public class Defragment {

    /**
     * Переносит заполненные ячейки в начало, а пустые - в конец
     *
     * @param array - массив символов
     */
    public static void compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                boolean fin = true;
                for (int i = (index + 1); i < array.length; i++) {
                    String next = array[i];
                    if (next != null) {
                        array[i] = cell;
                        array[index] = next;
                        fin = false;
                        break;
                    }
                }
                if (fin) {
                    break;
                }
            }
        }
    }
}
