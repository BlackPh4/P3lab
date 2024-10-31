package org.example;

public class Mango extends Fruit implements Peelable, SeedRemovable {
    private boolean isPeeled = false;
    private boolean seedsRemoved = false;


    public Mango(double weight, double sugarContent, double waterContent, Color color) {
        super(weight, sugarContent, waterContent, color);
    }


    @Override
    public boolean hasPeel() {
        return !isPeeled;
    }

    @Override
    public void peelOff() {
        if (!isPeeled) {
            isPeeled = true;
            System.out.println("The mango has been peeled.");
        } else {
            System.out.println("The mango is already peeled.");
        }
    }


    @Override
    public boolean hasSeeds() {
        return !seedsRemoved;
    }

    @Override
    public void removeSeeds() {
        if (!seedsRemoved) {
            seedsRemoved = true;
            System.out.println("The seeds have been removed from the mango.");
        } else {
            System.out.println("The seeds are already removed.");
        }
    }


    @Override
    public void displayFruitInfo() {
        System.out.println("Mango Info:");
        System.out.println("Weight: " + getWeight() + " grams");  // Use getter methods
        System.out.println("Sugar Content: " + getSugarContent() + "%");
        System.out.println("Water Content: " + getWaterContent() + "%");
        System.out.println("Color: " + getColor());  // Use getter to get the color
        System.out.println("Peeled: " + (isPeeled ? "Yes" : "No"));
        System.out.println("Seeds Removed: " + (seedsRemoved ? "Yes" : "No"));
    }
}
