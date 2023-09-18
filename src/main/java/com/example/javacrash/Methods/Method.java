package com.example.javacrash.Methods;

public class Method  {
    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;


        if(gameOver){
            finalScore += (levelCompleted + bonus);
            finalScore += 10000;
            System.out.println("Your final score is " + finalScore);
        }

    }
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;


        calculateScore();

        score = 10000;
        levelCompleted = 8;
        bonus = 160;
        finalScore = score;
        if(gameOver){
            finalScore += (levelCompleted + bonus);
            finalScore += 1000;
            System.out.println("Your second final score is " + finalScore);
        }
    }
}
