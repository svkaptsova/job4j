package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * School - класс для распределения учеников по разным группам
 * в зависимости от общего балла по всем предметам
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
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

    /**
     * Метод отбирает учеников с баллом > bound
     *
     * @param students  - список всех учеников
     * @param bound - проходной балл
     * @return - список группы в соответствии с проходным баллом
     */
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(st -> st != null)
                .sorted((left, right) -> Integer.compare(right.getScore(), left.getScore()))
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}
