package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SearchNameActionTest {
    @Test
    public void whenPutNameThenGetItems() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item item1 = new Item("First");
        Item item2 = new Item("First");
        Item item3 = new Item("Third");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        new SearchNameAction().execute(new StubInput(new String[]{"First"}), tracker);
        assertThat(new String(out.toByteArray()),
                is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add(item1.getId() + " " + item1.getName())
                        .add(item2.getId() + " " + item2.getName())
                        .toString()));

        System.setOut(def);
    }
}
