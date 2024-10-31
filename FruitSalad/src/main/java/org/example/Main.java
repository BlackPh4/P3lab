package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Banana banana = new Banana(120.0, 12.0, 80.0);
        Apple apple = new Apple(150.0, 17.5, 25.0, Arrays.asList(Fruit.Color.RED, Fruit.Color.GREEN));
        Mango mango = new Mango(200.0, 15.0, 70.0, Fruit.Color.YELLOW);


        Fruit[] fruits = {banana, apple, mango};


        System.out.println("Preparing Fruits:");
        Fruit.prepareFruit(fruits);


        System.out.println("\nFinal Fruit Information:");
        for (Fruit fruit : fruits) {
            fruit.displayFruitInfo();
        }
    }
}
