package ru.job4j.collection;

/**
 * Task - модель задачи
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}
