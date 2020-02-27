package ru.job4j.tracker;

public class Engineer extends Profession {
    private String specialty;

    public Engineer(String n, String sn, String ed, String bd) {
        super(n, sn, ed, bd);
    }

    public Engineer(String n, String sn, String ed, String bd, String sp) {
        super(n, sn, ed, bd);
        this.specialty = sp;
    }
}
