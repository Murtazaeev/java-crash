package com.example.javacrash.tillInheritance.Methods;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1,0));
    }
    public  static boolean hasEqualSum(int first, int second, int third){
        int sumOfTwo = first + second;
        if (!(sumOfTwo == third)){
            return false;
        } else {
            return true;
        }
    }
}
