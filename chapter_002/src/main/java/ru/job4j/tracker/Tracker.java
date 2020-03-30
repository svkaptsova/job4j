package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Tracker - Класс для CRUD-операций с заявками
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.8
 * @since 1.0
 */
public class Tracker {


    /**
     * Массив для хранения заявок
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item - новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки
     *
     * @return - уникальный ключ
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод для получения списка всех заявок
     *
     * @return массив заявок без пустых ячеек
     */
    public Item[] findAll() {
        Item[] result = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item name = items[i];
            if (name != null) {
                result[size] = name;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    /**
     * Метод для поиска заявки по имени
     *
     * @param name - имя заявки
     * @return - массив заявок с искомым именем
     */
    Item[] findByName(String name) {
        Item[] result = new Item[position];
        int size = 0;
        for (int i = 0; i < position; i++) {
            if (items[i].getName().equals(name)) {
                result[size] = items[i];
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return size != 0 ? result : null;
    }

    /**
     * Метод для поиска заявки по id
     *
     * @param id - уникальный ключ
     * @return - индекс ячейки с искомой заявкой
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод для поиска заявки по id
     *
     * @param id - уникальный ключ
     * @return - искомая заявка
     */
    Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * Метод для замены заявки
     *
     * @param id - уникальный ключ заменяемой заявки
     * @param item - новая заявка
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index].setName(item.getName());
            result = true;
        }
        return result;
    }

    /**
     * Метод для удаления заявки
     *
     * @param id - уникальный ключ удаляемой заявки
     */
    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1 && index < position) {
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position - 1] = null;
            position--;
            result = true;
        }
        return result;
    }

    public int size() {
        return position;
    }
}
