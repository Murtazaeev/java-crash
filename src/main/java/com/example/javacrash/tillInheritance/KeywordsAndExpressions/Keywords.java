package com.example.javacrash.tillInheritance.KeywordsAndExpressions;

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
        // challange 2
        boolean gameOver2 = true;
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

        int finalScore2 = score2;

        if(gameOver2) {
            finalScore2 += (levelCompleted2 + bonus2);
            System.out.println("your final score is " + finalScore2);
        }








    }
}
