package com.example.javacrash.tillInheritance.ChallangesForLoops;

public class isPerfectNumber {

    public static void main(String[] args) {
     isPerfectNumber(6);
    }
    public static boolean  isPerfectNumber(int number){

        if(number < 1) return false;
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if((number % i) == 0) {

                sum += i;
            }
            else {
                i += 0;
            }
        }

        return (sum == number);
    }

}
