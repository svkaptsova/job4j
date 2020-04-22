package ru.job4j.tracker;

        import org.junit.Test;
        import ru.job4j.oop.casting.Input;
        import ru.job4j.oop.casting.StubInput;

        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Foo"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Foo");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenShowItems() {
        Tracker tracker = new Tracker();
        StartUI.showItems(tracker);
        Item item = new Item("Foo");
        tracker.add(item);
        Item[] items = tracker.findAll();
        Item[] expected = {item};
        assertThat(items, is(expected));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("Foo");
        tracker.add(item);
        String[] answers = {item.getId(), "Bar"};
        Input input = new StubInput(answers);
        StartUI.replaceItem(input, tracker);
        Item replaced = tracker.findById(answers[0]);
        Item expected = new Item("Bar");
        assertThat(replaced.getName(), is(expected.getName()));
    }

    @Test
    public void whenSearchById() {
        Tracker tracker = new Tracker();
        Item item = new Item("Foo");
        tracker.add(item);
        String[] answers = {item.getId()};
        Input input = new StubInput(answers);
        StartUI.searchId(input, tracker);
        Item found = tracker.findById(item.getId());
        assertThat(found, is(item));
    }

    @Test
    public void whenSearchByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("Foo");
        tracker.add(item);
        String[] answers = {"Foo"};
        Input input = new StubInput(answers);
        StartUI.searchName(input, tracker);
        Item[] found = tracker.findByName("Foo");
        Item[] expected = {item};
        assertThat(found, is(expected));
    }
}
