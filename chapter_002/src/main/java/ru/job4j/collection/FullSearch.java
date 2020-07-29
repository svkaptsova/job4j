package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * FullSearch - класс для исключения дубликатов задач из списка
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
 * @since 1.0
 */
public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
