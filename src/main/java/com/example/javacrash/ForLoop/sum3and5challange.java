package com.example.javacrash.ForLoop;

public class sum3and5challange {
    public static void main(String[] args) {
//        int countMatches = 0;
//        int sumOfMatches= 0;
//        for (int i = 1; i<=1000; i++){
//
//            if((i % 3 == 0) && (i % 5 == 0)){
//                countMatches++;
//                sumOfMatches += i;
//                System.out.println("found a match " + i);
//            }
//            if(countMatches == 5){
//                break;
//            }
//        }
//        System.out.println("sum = " + sumOfMatches);

        System.out.println(sumOdd(1, 11));
    }


    public static boolean isOdd(int number) {
        return (number > 0 && number % 2 != 0) ? true : false;
    }



    public static int sumOdd(int start, int end) {
        int sumOfOdd = 0;
        if ((start > end) || start < 0 || end < 0) {
            sumOfOdd = -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfOdd = sumOfOdd + i;
                } else {
                    return -1;
                }
            }

        }


        return sumOfOdd;
    }
}