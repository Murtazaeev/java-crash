package com.example.javacrash.KeywordsAndExpressions;

public class Keywords {
    public static void main(String[] args) {

        boolean gameOver = true;

        int score = 5000;

        int levelCompleted = 5;

        int bonus = 100;

        if(score == 5000){
            System.out.println("Your score was 5000");
        }


        if(score < 5000 && score > 10000){
            System.out.println("Your score is less the 5000");
        }else if (score < 10000){
            System.out.println("Got here");
        }
        else {
            System.out.println("smash!");
        }
    }
}
