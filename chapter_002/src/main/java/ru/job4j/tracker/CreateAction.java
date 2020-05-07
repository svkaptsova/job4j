package ru.job4j.tracker;

/**
 * CreateAction - класс для добавления новой заявки
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "=== Create a new Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println(item);
        System.out.println();
        return true;
    }
}
