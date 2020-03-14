package ru.job4j.oop.pojo.prod;

public class Shop {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);

        Product[] prods = new Product[5];

        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;

        int i;

        for (i = 0; i < prods.length; i++) {
            Product pr = prods[i];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();

        prods[1] = null;

        for (i = 0; i < prods.length; i++) {
            Product pr = prods[i];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }

        System.out.println();

        for (i = 1; i < prods.length - 1; i++) {
            Product temp = prods[i];
            prods[i] = prods[i + 1];
            prods[i + 1] = temp;
            prods[prods.length - 1] = null;
        }

        prods[prods.length - 1] = null;

        for (i = 0; i < prods.length; i++) {
            Product pr = prods[i];
            if (pr != null) {
                System.out.println(pr.getName() + " - " + pr.getCount());
            } else {
                System.out.println("null");
            }
        }
    }
}

