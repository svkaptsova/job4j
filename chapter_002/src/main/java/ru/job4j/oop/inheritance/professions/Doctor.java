package ru.job4j.oop.inheritance.professions;

/**
 * Doctor - подкласс для демонстрации создания иерархии классов при наследовании.
 *
 * @author Svetlana Kaptsova (svkapcova@gmail.com)
 * @version 1.1
 * @since 1.0
 */
public class Doctor extends Profession {
    private String specialty;
    private int patients;

    public Doctor(String n, String sn, String ed, String bd) {
        super(n, sn, ed, bd);
    }

    public Doctor(String n, String sn, String ed, String bd, String sp) {
        super(n, sn, ed, bd);
        this.specialty = sp;
    }

    public int getPatients() {
        return 0;
    }
}
