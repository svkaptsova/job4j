package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * FullSearch - класс для исключения дубликатов задач из списка
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        int i = 0;
        for (Task task : list) {
            numbers.add(list.get(i).getNumber());
            i++;
        }
        return numbers;
    }
}
