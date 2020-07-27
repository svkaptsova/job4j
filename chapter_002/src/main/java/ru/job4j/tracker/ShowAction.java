package ru.job4j.tracker;

import java.util.List;

/**
 * ShowAction - класс для просмотра всех заявок
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
 * @since 1.0
 */
public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "=== All Items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i));
            System.out.println();
        }
        System.out.println();
        return true;
    }
}
