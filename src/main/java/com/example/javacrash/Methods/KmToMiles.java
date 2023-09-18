package com.example.javacrash.Methods;

public class KmToMiles {
    public static void main(String[] args) {
        double milesToKm = toMilesPerHour(75.114);

        printConversion(1.25);

        //int conversion = Math.round(printConversion(-5.6));
    }


    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }

    }

}
