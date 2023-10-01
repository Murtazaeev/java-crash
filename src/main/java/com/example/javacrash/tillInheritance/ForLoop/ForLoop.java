package com.example.javacrash.tillInheritance.ForLoop;

public class ForLoop {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

        for (double interestRate = 7.5; interestRate <= 10; interestRate += 0.25){
            double calcInterest = calculateInterest(100, interestRate);
            System.out.println("wdwdwd" + interestRate +" wdwdwdw" +  calcInterest);
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
