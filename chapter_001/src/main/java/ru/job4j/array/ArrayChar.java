package ru.job4j.array;

/**
 * ArrayChar Класс для проверки, что слово начинается с определенной последовательности символов.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 13.01.2020
 */
public class ArrayChar {

    /**
     * Сравнение элементов двух массивов с оодинаковым индексом
     *
     * @param word - заданный массив символов
     * @param pref - массив, содержащий ключевую последовательность символов для сверки с заданным массивом
     * @return - возвращает true (значения всех элементов ключевой последовательности совпадают
     * с элементами соответствующих ячеек заданного массива),
     * либо false (значение хотя бы одного элемента отличаеся)
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
