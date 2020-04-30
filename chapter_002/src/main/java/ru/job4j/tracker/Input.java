package ru.job4j.tracker;

/**
 * Input - интерфейс ввода данных
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public interface Input {
    String askStr(String question);

    int askInt(String question);
}
