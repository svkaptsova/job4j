package ru.job4j.oop.inheritance.professions;

/**
 * Programmer - подкласс для демонстрации создания иерархии классов при наследовании.
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
 * @since 1.0
 */
public class Programmer extends Engineer {
    private boolean tools;

    public Programmer(String n, String sn, String ed, String bd, String sp) {
        super(n, sn, ed, bd, sp);
    }

    public boolean getTools() {
        return false;
    }
}
