package com.example.javacrash.afterInheritence.InheritanceChallange1.Polymorphism.challange;

public class HybridCar extends Car {
    private double avgKmPerLitre = 2.5;
    private int batterySize = 250;
    private int cylinders = 4;

    public HybridCar(String description) {

        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("%nHybrid -> started hybrid engine " + cylinders+ " cylinders");
        System.out.printf("%nHybrid -> switch " + batterySize + " kWh battery on%n");
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> running engine and " + avgKmPerLitre + " consumption");
    }
}
