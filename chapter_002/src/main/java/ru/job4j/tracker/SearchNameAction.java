package ru.job4j.tracker;

public class SearchNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Search by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items != null) {
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i]);
            }
        } else {
            System.out.println("Not found");
        }
        System.out.println();
        return true;
    }
}
