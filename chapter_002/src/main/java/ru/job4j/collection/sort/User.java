package ru.job4j.collection.sort;

import java.util.Objects;

/**
 * User - модель пользователя
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.0
 * @since 1.0
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод для сортировки пользователей по имени или возрасту
     *
     * @param user - пользователь
     */
    @Override
    public int compareTo(User user) {
        int rsl = this.name.compareTo(user.name);
        if (user.name.equals(this.name)) {
            rsl = Integer.compare(age, user.age);
        }
        return rsl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
