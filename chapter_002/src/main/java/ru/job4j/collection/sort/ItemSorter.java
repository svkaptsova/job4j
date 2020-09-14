package ru.job4j.collection.sort;

import java.util.Collections;
import java.util.List;

/**
 * ItemSorter - класс для сортировки заявок по возрастанию и убыванию
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class ItemSorter {

    /**
     * Метод для сортировки заявок по возрастанию id
     *
     * @param items - список заявок
     */
    public static void sortUpId(List<Item> items) {
        Collections.sort(items);
    }

    /**
     * Метод для сортировки заявок по возрастанию имени
     *
     * @param items - список заявок
     */
    public static void sortUpName(List<Item> items) {
        items.sort(new SortByNameItem());
    }

    /**
     * Метод для сортировки заявок по убыванию
     *
     * @param items - список заявок
     */
    public static void sortDown(List<Item> items) {
        items.sort(Collections.reverseOrder());
    }
}
