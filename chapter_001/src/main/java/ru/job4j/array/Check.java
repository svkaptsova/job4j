package ru.job4j.array;

/**
 * Check Класс для проверки однородности массива.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 12.01.2020
 */
public class Check {

    /**
     * Сравнение элементов массива
     *
     * @param data - массив чисел
     * @return - возвращает true (значения всех элементов одиноковы),
     * либо false (значение хотя бы одного элемента отличаеся)
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if (data[index] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
