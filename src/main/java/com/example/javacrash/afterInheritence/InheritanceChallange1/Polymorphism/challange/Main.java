package com.example.javacrash.afterInheritence.InheritanceChallange1.Polymorphism.challange;

public class Main {

    public static void main(String[] args) {
//        Car car = new Car("2023 Blue Ferrari GTS");
//        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.5, 6);
        runRace(ferrari);

        ElectricCar byd = new ElectricCar("2023 BYD HAN 3,9 sec",
                560, 439);
        runRace(byd);

        HybridCar toyota = new HybridCar("1999 Toyota beast 13.9 sec",
                2.5, 250,4);
        runRace(toyota);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }

}
