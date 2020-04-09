package ru.job4j.oop.casting;

/**
 * College - класс для примера приведения типов
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class College {
    public static void main(String[] args) {
        Freshman frsh = new Freshman();
        Student std = frsh;
        Object objt = frsh;
    }
}
