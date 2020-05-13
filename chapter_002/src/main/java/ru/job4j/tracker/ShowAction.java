package ru.job4j.tracker;

/**
 * ShowAction - класс для просмотра всех заявок
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "=== All Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i]);
        }
        System.out.println();
        return true;
    }
}
