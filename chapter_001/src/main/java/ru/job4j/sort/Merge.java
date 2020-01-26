package ru.job4j.sort;

import java.util.Arrays;

/**
 * Merge Класс для слияния двух массивов.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 26.01.2020
 */
public class Merge {

    /**
     * Метод заполняет третий массив элементами первого и второго в порядке возрастания
     *
     * @param left  - первый массив
     * @param right - второй массив
     * @return - третий массив
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int a = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                rsl[a] = left[i];
                i++;
                a++;
            } else {
                rsl[a] = right[j];
                j++;
                a++;
            }
        }
        for (; j < right.length; j++, a++) {
            rsl[a] = right[j];
        }
        for (; i < left.length; i++, a++) {
            rsl[a] = left[i];
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
