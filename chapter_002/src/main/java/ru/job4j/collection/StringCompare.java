package ru.job4j.collection;

import java.util.Comparator;

/**
 * StringCompare - класс для сравнения строк (альтернатива методу String.compareTo)
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class StringCompare implements Comparator<String> {


    /**
     * Метод переводит String в массив char и сравнивает лексикографически
     * элементы двух массивов с одинаквым индексом
     *
     * @param o1  - первая строка
     * @param o2  - вторая строка
     *
     * @return - 0/ отрицательное значение/ положительное значение
     */
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        char[] str1 = o1.toCharArray();
        char[] str2 = o2.toCharArray();
        int size = Math.min(str1.length, str2.length);

        for (int i = 0; i < size; i++) {
            int rsl = Character.compare(str1[i], str2[i]);
            if (rsl != 0) {
                result = rsl;
                break;
            }
        }
        if (result == 0) {
            result = Integer.compare(o1.toCharArray().length, o2.toCharArray().length);
        }
        return result;
    }
}
