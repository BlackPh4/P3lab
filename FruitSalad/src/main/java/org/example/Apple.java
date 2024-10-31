package org.example;

import java.util.List;

public class Apple extends Fruit implements SeedRemovable {
    private boolean seedsRemoved = false;
    private List<Color> colors;

    public Apple(double weight, double sugarContent, double waterContent, List<Color> colors) {
        super(weight, sugarContent, waterContent, colors.isEmpty() ? null : colors.get(0));  // Use first color or null if colors list is empty
        this.colors = colors;
    }

    @Override
    public boolean hasSeeds() {
        return !seedsRemoved;
    }

    @Override
    public void removeSeeds() {
        if (!seedsRemoved) {
            seedsRemoved = true;
            System.out.println("The seeds have been removed from the apple.");
        } else {
            System.out.println("The seeds are already removed.");
        }
    }

    @Override
    public void displayFruitInfo() {
        System.out.println("Apple Info:");
        System.out.println("Weight: " + getWeight() + " grams");  // Use getter methods
        System.out.println("Sugar Content: " + getSugarContent() + "%");
        System.out.println("Water Content: " + getWaterContent() + "%");
        System.out.println("Colors: " + colors);
        System.out.println("Seeds Removed: " + (seedsRemoved ? "Yes" : "No"));
    }
}
