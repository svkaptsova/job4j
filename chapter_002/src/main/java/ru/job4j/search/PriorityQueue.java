package ru.job4j.search;

import java.util.LinkedList;

/**
 * PriorityQueue - коллекция очередь с приоритетами
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        if (tasks.size() == 0) {
            this.tasks.add(0, task);
        } else if (task.getPriority() > tasks.get(tasks.size() - 1).getPriority()) {
            this.tasks.add(tasks.size() - 1, task);
        } else {
            for (int index = 0; index < tasks.size() - 1; index++) {
                if (task.getPriority() < tasks.get(index).getPriority()) {
                    this.tasks.add(index, task);
                }
            }
        }
    }

    public Task take() {
        return tasks.poll();
    }
}
