package ru.job4j.tracker;

public class Doctor extends Profession {
    private String specialty;

    public Doctor(String n, String sn, String ed, String bd) {
        super(n, sn, ed, bd);
    }

    public Doctor(String n, String sn, String ed, String bd, String sp) {
        super(n, sn, ed, bd);
        this.specialty = sp;
    }
}
