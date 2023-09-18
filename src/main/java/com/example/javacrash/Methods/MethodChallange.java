package com.example.javacrash.Methods;

public class MethodChallange {
    public static void main(String[] args) {
        int highScorePoint = calculateHightScorePosition(1500);
        displayHighScorePosition("Temur", highScorePoint);
         highScorePoint = calculateHightScorePosition(900);
        displayHighScorePosition("Boboyor", highScorePoint);
         highScorePoint = calculateHightScorePosition(400);
        displayHighScorePosition("Boxodir", highScorePoint);
         highScorePoint = calculateHightScorePosition(25);
        displayHighScorePosition("Nuna", highScorePoint);
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score list");
    }
    public static int calculateHightScorePosition(int playerScore){
                if(playerScore > 1000){
                    return 1;
                } else if (playerScore >= 500 && playerScore < 1000) {
                    return 2;
                } else if (playerScore >= 100 && playerScore < 500) {
                    return 3;
                }
                else {
                    return 4;
                }

    }
}
