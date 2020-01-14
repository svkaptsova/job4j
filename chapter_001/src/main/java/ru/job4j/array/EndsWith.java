package ru.job4j.array;

/**
 * EndsWith Класс для проверки окончания слова.
 *
 * @author Svetlana Kaptsova
 * @version 1.0
 * @since 13.01.2020
 */
public class EndsWith {

    /**
     * Сравнение элементов двух массивов
     *
     * @param word - заданный массив символов
     * @param post - массив с ключевой последовательностью символов для сверки
     * @return - возвращает true (все элементы одного массива совпадают с элементами
     * соответствующих ячеек другого), либо false (значение хотя бы одного элемента отличаеся)
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int indw = (word.length - 1);
        for (int indp = (post.length - 1); indp >= 0; indw--, indp--) {
            if (post[indp] != word[indw]) {
                result = false;
                break;
            }
        }
        return result;
    }
}

