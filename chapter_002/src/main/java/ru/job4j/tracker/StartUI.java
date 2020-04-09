package ru.job4j.tracker;

import java.util.Scanner;

/**
 * StartUI - консольное приложение для работы с классом Tracker
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.3
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

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println(item);
                System.out.println();

            } else if (select == 1) {
                System.out.println("=== All Items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
                System.out.println();

            } else if (select == 2) {
                System.out.println("=== Мake changes ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                boolean replaced = tracker.replace(id, item);
                System.out.println(replaced);
                System.out.println();

            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                boolean deleted = tracker.delete(id);
                System.out.println(deleted);
                System.out.println();

            } else if (select == 4) {
                System.out.println("=== Search by id ====");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                    System.out.println();
                } else {
                    System.out.println("Not found");
                }
                System.out.println();

            } else if (select == 5) {
                System.out.println("=== Search by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length != 0) {
                    for (int i = 0; i < items.length; i++) {
                        System.out.println(items[i]);
                    }
                } else {
                    System.out.println("Not found");
                }
                System.out.println();

            } else if (select == 6) {
                run = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("Third");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        new StartUI().init(scanner, tracker);
    }
}
