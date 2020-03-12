package ru.job4j.oop.pojo;

import java.util.Date;

public class Police {
    public static void main(String[] args) {
        License license = new License();
        license.setOwner("Svetlana Kaptsova");
        license.setModel("Chevrolet");
        license.setCode("XnnnXX");
        license.setCreated(new Date());
        System.out.println(license.getOwner() + " has a car - " + license.getModel() + " " + license.getCode());
    }
}
