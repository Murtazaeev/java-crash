package com.example.javacrash.MethodOverloading;

public class PlayingCat {
    public static void main(String[] args) {

    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if((temperature >= 25 && temperature <= 35)){
            return true;
        }
        else if( temperature >= 25 && temperature <= 45){
            if(summer){
                return true;
            }
            else {
                return false;
            }

        }
        else {
            return false;
        }
    }
}


// 25 - 25 orasida oynaydi
// summer da esa 25-45 orasida