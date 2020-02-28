package ru.job4j.oop.inheritance.professions;

/**
 * Profession  - класс для демонстрации создания иерархии классов при наследовании.
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
 * @since 1.0
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String n, String sn, String ed, String bd) {
        this.name = n;
        this.surname = sn;
        this.education = ed;
        this.birthday = bd;
    }

    public String getName() {
        return null;
    }
}
