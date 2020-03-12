package ru.job4j.oop.inheritance.professions;

/**
 * Surgeon - подкласс для демонстрации создания иерархии классов при наследовании.
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
 * @since 1.0
 */
public class Surgeon extends Doctor {
    private int seniority;

    public Surgeon(String n, String sn, String ed, String bd, String sp) {
        super(n, sn, ed, bd, sp);
    }

    public int getSeniority() {
        return 0;
    }
}
