package ru.job4j.search;

import java.util.LinkedList;

/**
 * PriorityQueue - коллекция очередь с приоритетами
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
 * @since 1.0
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     *
     * @param task задача
     */
    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (task.getPriority() <= tasks.get(index).getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}
