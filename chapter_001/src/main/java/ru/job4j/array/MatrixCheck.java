package ru.job4j.array;

/**
 * MatrixCheck Класс для работы с элементами двумерного массива.
 *
 * @author Svetlana Kaptsova
 * @version 1.3
 * @since 17.01.2020
 */

public class MatrixCheck {

    /**
     * Проверяет, что вся строка заполнена 'X'
     *
     * @param board - массив
     * @param row   - строка
     * @return - true (если вся строка заполнена только 'X'), либо false
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

    /**
     * Проверяет, что весь столбец заполнен 'X'
     *
     * @param board  - массив
     * @param column - столбец
     * @return - true (если весь столбец заполнен только 'X'), либо false
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * Заполняет одномерный массив элементами диагонали матрицы
     *
     * @param board - матрица
     * @return - заполненный одномерный массив
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * Проверяет наличие в массиве выигрышной комбинации (игра Сокобан)
     *
     * @param board - матрица (игровое поле)
     * @return - true (если в массиве есть хотя бы один столбец или строка, заполненные 'X'),
     * либо false если выигрышной комбинации нет
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                if (monoHorizontal(board, i) || monoVertical(board, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
