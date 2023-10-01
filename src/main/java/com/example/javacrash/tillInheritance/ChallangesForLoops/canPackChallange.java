package com.example.javacrash.tillInheritance.ChallangesForLoops;

public class canPackChallange {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        for (int i =0; i<=bigCount; i++){
            for (int j=0; j<=smallCount; j++){
                if ((5*i)+j==goal)
                    return true;
            }
        }
        return false;
    }
}
