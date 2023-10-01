package com.example.javacrash.CarpetCostCalculator;

public class Carpet {

    public static void main(String[] args) {

    }

    private double cost;

    public Carpet(double cost) {
        if(cost < 0) cost = 0;
        else this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
