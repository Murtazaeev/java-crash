package com.example.javacrash.tillInheritance.MethodOverloading;

public class printYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);

    }
    public static void printYearsAndDays(long minutes){
        long toYear = minutes / (60 * 24 * 365);
        long leftYears = minutes % (60 * 24 * 365);
        long toDays = leftYears / (24 * 60);
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else {
            System.out.println( minutes + " min = " + toYear +  " y and " + toDays + " d" );
        }
    }
}
