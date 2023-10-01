package com.example.javacrash.tillInheritance.CarpetCostCalculator;

public class Calculator {

    Carpet carpet = new Carpet(3.5);
    Floor floor = new Floor(2.75, 4.0);


    public Calculator(Carpet carpet, Floor floor) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost() {
        return (carpet.getCost() * floor.getArea());
    }


}
