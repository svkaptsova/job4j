package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ConvertMatrix2List - класс для конвертации двумерного массива в одномерный список
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int row = 0, cell = 0;
        for (int[] rows : array) {
            for (int cells : rows) {
                if (row == rows.length) {
                    row = 0;
                    cell++;
                } else if (cell == array[cell].length) {
                    break;
                }
                list.add(array[cell][row]);
                row++;
            }
        }
        return list;
    }
}
