package ru.job4j.oop.overriding;

/**
 * TextReport - класс для изучения механизма переопределения метода.
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class TextReport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
