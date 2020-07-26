package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Tracker - Класс для CRUD-операций с заявками
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.10
 * @since 1.0
 */
public class Tracker {

    /**
     * Список заявок
     */
    private final List<Item> items = new ArrayList<>();


    /**
     * Метод добавления заявки в хранилище
     *
     * @param item - новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
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
     * @return список заявок без пустых ячеек
     */
    public List<Item> findAll() {
        List<Item> result = new ArrayList<>(items.size());
        for (int i = 0; i < items.size(); i++) {
            Item name = items.get(i);
            if (name != null) {
                result.add(name);
            }
        }
        return result;
    }

    /**
     * Метод для поиска заявки по имени
     *
     * @param name - имя заявки
     * @return - список заявок с искомым именем
     */
    List<Item> findByName(String name) {
        List<Item> result = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(name)) {
                result.add(items.get(i));
            }
        }
        return result.size() != 0 ? result : null;
    }

    /**
     * Метод для поиска заявки по id
     *
     * @param id - уникальный ключ
     * @return - индекс элемента с искомой заявкой
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
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
        return index != -1 ? items.get(index) : null;
    }

    /**
     * Метод для замены заявки
     *
     * @param id   - уникальный ключ заменяемой заявки
     * @param item - новая заявка
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            items.get(index).setName(item.getName());
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
        if (index != -1 && index < items.size()) {
            items.remove(items.get(index));
            result = true;
        }
        return result;
    }

    public int size() {
        return items.size();
    }

    @Override
    public String toString() {
        StringBuilder rsl = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            rsl.append(item);
            rsl.append(", ");
        }
        return rsl.toString();
    }
}
