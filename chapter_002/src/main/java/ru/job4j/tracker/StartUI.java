package ru.job4j.tracker;

import ru.job4j.oop.casting.ConsoleInput;
import ru.job4j.oop.casting.Input;

/**
 * StartUI - консольное приложение для работы с классом Tracker
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.5
 * @since 1.0
 */
public class StartUI {

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println(item);
        System.out.println();
    }

    public static void showItems(Input input, Tracker tracker) {
        System.out.println("=== All Items ====");
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        System.out.println();
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Мake changes ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        boolean replaced = tracker.replace(id, item);
        System.out.println(replaced);
        System.out.println();
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        String id = input.askStr("Enter id: ");
        boolean deleted = tracker.delete(id);
        System.out.println(deleted);
        System.out.println();
    }

    public static void searchId(Input input, Tracker tracker) {
        System.out.println("=== Search by id ====");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
            System.out.println();
        } else {
            System.out.println("Not found");
        }
        System.out.println();
    }

    public static void searchName(Input input, Tracker tracker) {
        System.out.println("=== Search by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i]);
            }
        } else {
            System.out.println("Not found");
        }
        System.out.println();
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Choice: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);

            } else if (select == 1) {
                StartUI.showItems(input, tracker);

            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);

            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);

            } else if (select == 4) {
                StartUI.searchId(input, tracker);

            } else if (select == 5) {
                StartUI.searchName(input, tracker);

            } else if (select == 6) {
                run = false;
            }
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("Third");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        new StartUI().init(input, tracker);
    }
}
