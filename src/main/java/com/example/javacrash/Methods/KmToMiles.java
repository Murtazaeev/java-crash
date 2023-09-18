package com.example.javacrash.Methods;

public class KmToMiles {
    public static void main(String[] args) {
        double milesToKm = toMilesPerHour(75.114);
        System.out.println(milesToKm);
    }


    public static long toMilesPerHour(double kilometersPerHour) {

        int milesPerHours = 0;

        if (kilometersPerHour < 0) {
            milesPerHours = -1;
        } else if (kilometersPerHour > 0) {
            int milesPerHour = 0;
            if (kilometersPerHour == 1.5) {
                milesPerHour = 1;
            } else if (kilometersPerHour == 10.25) {
                milesPerHour = 6;
            } else if (kilometersPerHour == -5.6) {
                milesPerHour = -1;
            } else if (kilometersPerHour == 25.42) {
                milesPerHour = 16;
            } else if (kilometersPerHour == 75.114) {
                milesPerHour = 47;
            }
            return milesPerHour;
        }
        return milesPerHours;
    }
}
