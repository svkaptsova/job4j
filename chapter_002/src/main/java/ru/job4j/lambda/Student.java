package ru.job4j.lambda;

public class Student {
        int age;
        String name;
        Mark mark;
        Student(Mark mark, String name, int age) {
            this.mark = mark;
            this.name = name;
            this.age = age;
        }
        public Mark getMark() {
            return mark;
        }

        public  String getName(){
            return name;
        }

        public int getAge() {
            return age;
        }
}
