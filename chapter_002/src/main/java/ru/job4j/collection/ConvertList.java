package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ConvertList - класс для конвертации листа массивов в лист int
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        int i = 0;
        for (int[] arr : list) {
            for (int cells : arr) {
                rsl.add(arr[i]);
                i++;
                if (i == arr.length) {
                    i = 0;
                    break;
                }
            }
        }
        return rsl;
    }
}
