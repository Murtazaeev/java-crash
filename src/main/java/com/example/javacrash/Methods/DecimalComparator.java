package com.example.javacrash.Methods;

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.176, 3.176);
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
            int myFirstCheck = (int)(first * 1000);
            int mySecondCheck = (int)(second * 1000);
            if(myFirstCheck - mySecondCheck == 0){

                return true;
            } else

                return false;

        }




}
