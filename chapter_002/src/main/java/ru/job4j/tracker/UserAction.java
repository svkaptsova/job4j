package ru.job4j.tracker;

/**
 * Input - интерфейс выполнения действия
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
