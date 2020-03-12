package ru.job4j.oop.pojo.libr;

public class Library {
    public static void main(String[] args) {
        Book novel = new Book("The Fountainhead", 753);
        Book crime = new Book("Ten Little Niggers", 256);
        Book tragedy = new Book("Hamlet", 300);
        Book comedy = new Book("Clean Code", 123);

        Book[] books = new Book[4];

        books[0] = novel;
        books[1] = crime;
        books[2] = tragedy;
        books[3] = comedy;

        System.out.println("There are such books in our library:");

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getTitle() + " " + bk.getPages() + "p.");
        }

        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;

        System.out.println("Change 1 and 4:");

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getTitle() + " " + bk.getPages() + "p.");
        }

        System.out.println("Search the book 'Clean Code':");

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean Code".equals(bk.getTitle())) {
                System.out.println(bk.getTitle() + " " + bk.getPages() + "p.");
            }
        }
    }
}
