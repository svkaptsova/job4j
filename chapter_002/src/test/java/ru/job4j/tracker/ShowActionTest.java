package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShowActionTest {
    @Test
    public void whenCheckOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        Tracker tracker = new Tracker();
        Item foo = new Item("Item");
        tracker.add(foo);
        new ShowAction().execute(new StubInput(new String[]{}), tracker);
        assertThat(new String(out.toByteArray()),
                is(new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                        .add(foo.getId() + " " + foo.getName())
                        .add("")
                        .toString()));
        System.setOut(def);
    }
}
