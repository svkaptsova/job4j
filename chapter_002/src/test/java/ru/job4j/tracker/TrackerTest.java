package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddThenGetItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("First");
        Item actual = tracker.add(item);
        assertThat(actual, is(item));
    }

    @Test
    public void whenFindAllThenGetArray3() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("Third");
        Item[] items = {tracker.add(item1), tracker.add(item2), tracker.add(item3)};
        Item[] actual = tracker.findAll();
        assertThat(actual.length, is(3));
    }

    @Test
    public void whenFindByNameThenGetArray2() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("First");
        Item item4 = new Item("First");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] expected = {item1, item3};
        Item[] actual = tracker.findByName(item4.getName());
        assertThat(actual, is(expected));
    }

    @Test
    public void whenFindByNameThenGetNull() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("First");
        Item item4 = new Item("Four");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item[] actual = tracker.findByName(item4.getName());
        assertNull(actual);
    }

    @Test
    public void whenHaveFindByIdThenGetItem3() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("Third");
        Item item4 = new Item("Four");
        Item[] items = {tracker.add(item1), tracker.add(item2), tracker.add(item3), tracker.add(item4)};
        Item actual = tracker.findById(item3.getId());
        assertThat(actual.getId(), is(items[2].getId()));
    }

    @Test
    public void whenMissingFindByIdThenGetNull() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("Second");
        Item item3 = new Item("Third");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        Item item4 = new Item("Four");
        Item actual = tracker.findById(item4.getId());
        assertNull(actual);
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDeleteThenGetItem() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        Item first = new Item("First");
        Item second = new Item("Second");
        tracker.add(first);
        tracker.add(second);
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertNull(tracker.findById(id));
        assertThat(tracker.size(), is(2));
    }
}

