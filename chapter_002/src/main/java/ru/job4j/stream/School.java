package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * School - класс для распределения учеников по разным группам
 * в зависимости от общего балла по всем предметам
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class School {
    /**
     * Метод сортирует учеников по общему баллу
     *
     * @param students  - список всех учеников
     * @param predicate - проверка балла
     * @return - список группы в соответствии с проходным баллом
     */
    public List<Student> collect(
            List<Student> students, Predicate<Student> predicate) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
