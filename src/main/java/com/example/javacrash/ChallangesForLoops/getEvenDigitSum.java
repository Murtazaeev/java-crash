package com.example.javacrash.ChallangesForLoops;

public class getEvenDigitSum {

    public static void main(String[] args) {
        getEvenDigitSum(22222);
        System.out.println(hasSharedDigit(12, 43));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) return -1;

        int sum = 0;
        int remainder = 0;
        while (number > 0) {
            remainder = number % 10;
            sum += (remainder % 2 == 0) ? remainder : 0;
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99) return false;

        int num2 = second;
        while (first > 0) {
            int num1 = first % 10;
            second = num2;
            while (num2 > 0) {
               int num22 = second % 10;
                if (num1 == num22) {
                    return true;
                } else {
                    num2 /= 10;
                }

            }
            first /= 10;
        }
        return false;
    }

}
