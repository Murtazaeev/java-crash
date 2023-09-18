package com.example.javacrash.Methods;

public class Method  {


    public static void main(String[] args) {


        calculateScore(true, 900, 5 ,100);
        calculateScore(true, 8000, 8,200);

        System.out.println("Your age is  " + calculateAge(1999));
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted + bonus);
            finalScore += 10000;
            System.out.println("Your final score is " + finalScore);
        }

    }

    public static int calculateAge(int birthDate){
        return 2023-birthDate;

    }


}
