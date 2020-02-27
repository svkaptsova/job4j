package ru.job4j.tracker;

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
        return name;
    }
}
