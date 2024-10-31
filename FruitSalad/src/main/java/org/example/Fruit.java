package org.example;

public abstract class Fruit {
    private double weight;
    private double sugarContent;
    private double waterContent;


    public enum Color {
        RED, YELLOW, GREEN, PURPLE
    }

    private Color color;

    public Fruit(double weight, double sugarContent, double waterContent, Color color) {
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.waterContent = waterContent;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public double getWaterContent() {
        return waterContent;
    }

    public Color getColor() {
        return color;
    }


    public abstract void displayFruitInfo();


    public static void prepareFruit(Fruit[] fruits) {
        for (Fruit fruit : fruits) {
            if (fruit instanceof Peelable) {
                Peelable peelableFruit = (Peelable) fruit;
                if (peelableFruit.hasPeel()) {
                    peelableFruit.peelOff();
                } else {
                    System.out.println(fruit.getClass().getSimpleName() + " is already peeled.");
                }
            }
            if (fruit instanceof SeedRemovable) {
                SeedRemovable seedRemovableFruit = (SeedRemovable) fruit;
                if (seedRemovableFruit.hasSeeds()) {
                    seedRemovableFruit.removeSeeds();
                } else {
                    System.out.println(fruit.getClass().getSimpleName() + " already has seeds removed.");
                }
            }
        }
    }
}
