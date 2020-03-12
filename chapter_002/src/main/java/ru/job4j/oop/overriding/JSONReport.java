package ru.job4j.oop.overriding;

/**
 * JSONReport - подкласс для изучения механизма переопределения метода.
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
 * @since 1.0
 */
public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "name : " + name + "\n" + "body : " + body;
    }
}
