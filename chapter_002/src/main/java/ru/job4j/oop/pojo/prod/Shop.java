package ru.job4j.oop.pojo.prod;

public class Shop {

    public static void print(Product[] prods) {
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
    }

    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);

        Product[] prods = new Product[5];

        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;

        Shop.print(prods);

        prods[1] = null;

        Shop.print(prods);

        for (int j = 1; j < prods.length - 1; j++) {
            Product temp = prods[j];
            prods[j] = prods[j + 1];
            prods[j + 1] = temp;
            prods[prods.length - 1] = null;
        }

        prods[prods.length - 1] = null;

        Shop.print(prods);
    }
}

