package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputDevice {
    private Scanner scanner = new Scanner(System.in);

    public static double computeWeight(Fruit[] fruits) {
        double totalWeight = 0.0;
        for (Fruit fruit : fruits) {
            if (fruit != null) {
                totalWeight += fruit.getWeight();
            }
        }
        return totalWeight;
    }

    public static double computeSugarContent(Fruit[] fruits) {
        double totalSugar = 0.0;
        for (Fruit fruit : fruits) {
            if (fruit != null) {
                totalSugar += fruit.getSugarContent();
            }
        }
        return totalSugar;
    }

    public Fruit[] readFruit(int numberOfFruits) {
        Fruit[] fruits = new Fruit[numberOfFruits];

        for (int i = 0; i < numberOfFruits; i++) {
            System.out.println("Enter details for fruit " + (i + 1) + ":");

            System.out.print("Type (apple/banana/mango): ");
            String type = scanner.nextLine().trim().toLowerCase();

            System.out.print("Weight (grams): ");
            double weight = scanner.nextDouble();

            System.out.print("Sugar Content (%): ");
            double sugarContent = scanner.nextDouble();

            System.out.print("Water Content (%): ");
            double waterContent = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            if (type.equals("apple")) {
                System.out.print("Colors (comma-separated, e.g., RED,GREEN): ");
                String colorInput = scanner.nextLine().toUpperCase();
                List<Fruit.Color> colors = new ArrayList<>();

                try {
                    for (String colorStr : colorInput.split(",")) {
                        colors.add(Fruit.Color.valueOf(colorStr.trim()));
                    }
                    fruits[i] = new Apple(weight, sugarContent, waterContent, colors);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid color(s). Skipping this Apple entry.");
                }

            } else if (type.equals("banana")) {
                fruits[i] = new Banana(weight, sugarContent, waterContent);

            } else if (type.equals("mango")) {
                System.out.print("Color (RED, GREEN, YELLOW, etc.): ");
                String colorInput = scanner.nextLine().toUpperCase();
                try {
                    Fruit.Color color = Fruit.Color.valueOf(colorInput);
                    fruits[i] = new Mango(weight, sugarContent, waterContent, color);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid color for mango. Skipping this entry.");
                }

            } else {
                System.out.println("Unknown fruit type. Skipping this entry.");
            }
        }

        return fruits;
    }
}
