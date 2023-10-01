package com.example.javacrash.tillInheritance.ChallangesForLoops;

public class numberToWords {
    public static void main(String[] args) {
        numberToWords(122);
        System.out.println(reverse(122));
        System.out.println(getDigitCount(122));
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for(int i = 0; i < getDigitCount(number); i++) {
            int lastDigit = number % 10;
            if (lastDigit == 0 ) number /= 10;
            lastDigit = number % 10;
            switch (lastDigit) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }

            number -= lastDigit;
        }
    }


    public static int reverse (int number) {


        int reverse = 0, remainder;

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }
}
