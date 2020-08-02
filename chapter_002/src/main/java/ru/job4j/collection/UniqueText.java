package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;

/**
 * UniqueText - класс для сравнения двух текстов на идентичность (антиплагиат)
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class UniqueText {

    /**
     * Метод проверяет, содержит ли оригинальный текст все элементы текста-дубликата
     *
     * @param originText    - оригинальный текст
     * @param duplicateText - текст-дубликат
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        Collections.addAll(check, origin);
        for (String word : text) {
            if (!check.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
