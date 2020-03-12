package ru.job4j.oop.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Матвеев Матвей Мтвеевич");
        student.setGroup("П-2019-09");
        student.setAdmission("01.09.2019");

        System.out.println("Студент " + student.getSurname() + " зачислен в группу №" + student.getGroup() + " " + student.getAdmission());
    }
}
