package com.example.javacrash.MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(1));
        System.out.println(convertToCentimeters(5, 8));
    }
    public static double convertToCentimeters(int inch){
        double toCm = (double) inch * 2.54;
        return toCm;
    }

    public static double convertToCentimeters(int heightFeet, int heightInch){
        return convertToCentimeters((heightFeet * 12) + heightInch);
    }

}


// 1 inch = 2.54 cm
// 1 feet = 12 inches

