package org.example;

public class Banana extends Fruit implements Peelable {
    private boolean isPeeled = false;


    public Banana(double weight, double sugarContent, double waterContent) {
        super(weight, sugarContent, waterContent, Color.YELLOW);
    }

    @Override
    public void displayFruitInfo() {
        System.out.println("Banana Info:");
        System.out.println("Weight: " + getWeight() + " grams");
        System.out.println("Sugar Content: " + getSugarContent() + "%");
        System.out.println("Water Content: " + getWaterContent() + "%");
        System.out.println("Color: " + getColor());
        System.out.println("Peeled: " + (isPeeled ? "Yes" : "No"));
    }


    @Override
    public boolean hasPeel() {
        return !isPeeled;
    }


    @Override
    public void peelOff() {
        if (isPeeled) {
            System.out.println("The banana is already peeled.");
        } else {
            isPeeled = true;
            System.out.println("The banana has been peeled.");
        }
    }
}


