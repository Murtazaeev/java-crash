package com.example.javacrash.tillInheritance.Methods;

public class isDogBarking {
    public static void main(String[] args) {
        System.out.println( shouldWakeUp(true, -1));

    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if(!isBarking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)){
            return false;
        }
        else {
            return true;
        }
    }
}
