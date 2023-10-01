package com.example.javacrash.tillInheritance.ChallangesForLoops;

public class firstAndLastSum {

    public static void main(String[] args) {
        System.out.println(5 % 10);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int lastDigit = number % 10;

        while (number > 9) {
            number = number / 10;
        }
        return number + lastDigit;
    }
}