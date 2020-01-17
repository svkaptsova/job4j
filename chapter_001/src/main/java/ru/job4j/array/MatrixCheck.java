package ru.job4j.array;

/**
 * MatrixCheck Класс для проверки строки массива.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 17.01.2020
 */

public class MatrixCheck {

    /**
     * Проверяет, что вся строка заполнена 'X'
     *
     * @param board - массив
     * @param row - строка
     * @return - true (если в строке только 'X'), либо false
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
