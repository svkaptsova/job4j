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
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() >= tasks.get(index).getPriority()) {
                this.tasks.add(index, task);
            } else {
                this.tasks.add(tasks.size(), task);
            }
        }
    }

    public Task take() {
        return tasks.poll();
    }
}
