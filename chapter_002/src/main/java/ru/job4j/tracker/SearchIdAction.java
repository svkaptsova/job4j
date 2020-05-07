package ru.job4j.tracker;

/**
 * SearchIdAction - класс для поиска заявки по id
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class SearchIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Search by id ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
            System.out.println();
        } else {
            System.out.println("Not found");
        }
        System.out.println();
        return true;
    }
}
