package ru.job4j.collection;

import java.util.List;

/**
 * ConvertList2Array - класс для конвертации одномерного списка в двумерный массив
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class ConvertList2Array {

    /**
     * Метод разбивает элементы одномерного списка на несколько групп
     * и преобразует его в двумерный массив.
     *
     * @param cells - количество групп
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (cell >= cells) {
                cell = 0;
                row++;
            }
            array[row][cell] = num;
            cell++;
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
