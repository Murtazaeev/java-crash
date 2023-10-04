package com.example.javacrash.afterInheritence.InheritanceChallange1.Polymorphism.challange;

public class ElectricCar extends Car{

    private double avgKmPerCharge;
    private int batterySize = 430;


    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("%nElectric -> Battery " + batterySize + " in, good to go!%n");
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electric -> No gas, but wait! I can go upto "+
                avgKmPerCharge + " km for this battery %n");
    }
}
