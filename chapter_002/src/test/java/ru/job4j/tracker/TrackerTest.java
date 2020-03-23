package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddThenGetItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("First");
        assertThat(tracker.add(item), is(item));
    }

    @Test
    public void whenFindAllThenGetArray3() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("Third");
        Item[] items = {tracker.add(item1), tracker.add(item2), tracker.add(item3)};
        assertThat(tracker.findAll(), is(items));
    }

    @Test
    public void whenFindByNameThenGetArray2() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("First");
        Item item4 = new Item("First");
        Item[] expected = {tracker.add(item1), tracker.add(item3)};
        Item[] actual = tracker.findByName(item4);
        assertThat(actual, is(expected));
    }

    @Test
    public void whenHaveFindByIdThenGetItem3() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("Third");
        Item item4 = new Item("Four");
        Item[] items = {tracker.add(item1), tracker.add(item2), tracker.add(item3), tracker.add(item4)};
        Item actual = tracker.findById(item3);
        assertThat(actual, is(items[2]));
    }

    @Test
    public void whenMissingFindByIdThenGetNull() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("Third");
        Item item4 = new Item("Four");
        Item item = null;
        Item actual = tracker.findById(item4);
        Item[] items = {tracker.add(item1), tracker.add(item2), tracker.add(item3)};
        assertThat(actual, is(item));
    }
}
