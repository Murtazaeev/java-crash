package com.example.javacrash.tillInheritance.Methods;

public class isLeapYear {
    public static void main(String[] args) {
        System.out.println(" the year u inserted is " + isLeapYear(1924));
    }
    public static boolean isValidYear(int year){
        if(!(year >= 1 && year <= 9999)){
            return false;
        }
        else {
            return true;
        }
    }
            public static boolean isLeapYear(int year){

            boolean isLeapYear = false;
            int stepOne = year % 4;
            int stepTwo = year % 100;
            int stepThree = year % 400;

            if(isValidYear(year)){
                if(stepOne == 0){
                    if(stepTwo == 0){
                        if(stepThree == 0){
                            isLeapYear = true;
                        }
                    }else{
                        isLeapYear = true;
                    }

                }else{
                    isLeapYear = false;
                }

            }else{
                isLeapYear = false;
            }
            return isLeapYear;

        }


}
