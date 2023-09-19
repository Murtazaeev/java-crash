package com.example.javacrash.MethodOverloading;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
    }


    public static double area(double radius){
        if(radius < 0 ){
            return -1;
        }
        else {
            double calcCircle = radius * radius * Math.PI;
            return calcCircle;
        }
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        else {
            double calcArea = x * y;
            return calcArea;
        }

    }


}

