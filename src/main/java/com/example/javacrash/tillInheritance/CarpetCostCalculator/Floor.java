package com.example.javacrash.tillInheritance.CarpetCostCalculator;

public class Floor {

    public static void main(String[] args) {

    }

    private double width;
    private double lenght;

    public Floor(double width, double lenght) {

        if(width < 0) width = 0;
        else this.width = width;
        if(lenght < 0) lenght = 0;
        else this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getArea() {
        return (width * lenght);
    }

}
