package com.example.javacrash.tillInheritance.ChallangesForLoops;

public class getLargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {

        if(number < 0) return -1;

        int primeNumber = 1;
        for(int i = 1; i <= number; i++){
            if( number % i == 0) {
                primeNumber = i;
            }
        }
        return  primeNumber;
    }
}
