package ru.job4j.tracker;

/**
 * DeleteAction - класс для удаления заявки
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        boolean deleted = tracker.delete(id);
        System.out.println(deleted);
        System.out.println();
        return true;
    }
}
