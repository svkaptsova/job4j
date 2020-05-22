package ru.job4j.tracker;

/**
 * StartUI - консольное приложение для работы с классом Tracker
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.8
 * @since 1.0
 */
public class StartUI {

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = Integer.valueOf(input.askInt("Choice: ", 5));
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    public static void main(String[] args) {
        Input input = new ValidateInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(), new ShowAction(),
                new ReplaceAction(), new DeleteAction(),
                new SearchIdAction(), new SearchNameAction()};
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("Third");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        new StartUI().init(input, tracker, actions);
    }
}
