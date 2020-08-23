package ru.job4j.collection.sort;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemSorterTest {
    @Test
    public void whenPut231ThenGet123() {
        ItemSorter srt = new ItemSorter();
        Item first = new Item(1, "First");
        Item second = new Item(2, "Second");
        Item third = new Item(3, "Third");
        List<Item> items = Arrays.asList(second, third, first);
        assertThat(srt.sortUpId(items), is((Arrays.asList(first, second, third))));
    }

    @Test
    public void whenPut213ThenGet123() {
        ItemSorter srt = new ItemSorter();
        Item first = new Item(1, "First");
        Item second = new Item(2, "Second");
        Item third = new Item(3, "Third");
        List<Item> items = Arrays.asList(second, first, third);
        assertThat(srt.sortUpName(items), is((Arrays.asList(first, second, third))));
    }

    @Test
    public void whenPut231ThenGet321() {
        ItemSorter srt = new ItemSorter();
        Item first = new Item(1, "First");
        Item second = new Item(2, "Second");
        Item third = new Item(3, "Third");
        List<Item> items = Arrays.asList(second, third, first);
        assertThat(srt.sortDown(items), is((Arrays.asList(third, second, first))));
    }
}
