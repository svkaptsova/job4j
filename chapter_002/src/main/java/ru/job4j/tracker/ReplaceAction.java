package ru.job4j.tracker;

/**
 * ReplaceAction - класс для замены заявки
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Мake changes ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        boolean replaced = tracker.replace(id, item);
        System.out.println(replaced);
        System.out.println();
        return true;
    }
}
