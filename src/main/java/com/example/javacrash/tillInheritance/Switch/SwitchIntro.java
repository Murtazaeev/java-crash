package com.example.javacrash.tillInheritance.Switch;

public class SwitchIntro {
    public static void main(String[] args) {
        String switchValue = "A";

        switch (switchValue) {
            case "A" -> System.out.println("Able");
            case "B" -> System.out.println("Baker");
            case "C" -> System.out.println("Charlie");
            case "D" -> System.out.println("Dog");
            case "E" -> System.out.println("Easy");
            default -> System.out.println("bad");


        }
        printDayOfWeek(0);
        printNumberInWord(3);
        System.out.println("the given year is: " +  isLeapYear(2017));;

    }

    public  static void printDayOfWeek(int day){

        String dayOfWeek = switch (day){
                case 0 -> { yield "sunday" ;}
                case 1 ->  "Monday";
                case 2 -> "tuesday";
                case 3 -> "wednesday";
                case 4 ->  "thursday";
                case 5 -> "friday";
                case 6 ->  "saturday";
                default -> "bad";
            };

        System.out.println(dayOfWeek);

    }

    public static void printNumberInWord(int number){
        switch (number) {
            case 0 -> System.out.println("ZERO");
            case 1 ->  System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 ->  System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 ->  System.out.println("SIX");
            case 7 ->  System.out.println("SEVEN");
            case 8 ->  System.out.println("EIGHT");
            case 9 ->  System.out.println("NINE");
        }
    }

    public static boolean isLeapYear(int year){
       if(year < 1 || year > 9999) return false;
       return ((year%4==0) && (year%100!=0) || (year%400==0));
    }
    public static int getDaysInMonth(int month,int year){

        if(month <1 ||month>12||year <1 ||year>9999)
            return -1;

        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(isLeapYear(year))
                    return 29;
                return 28;
            default: return 31;
        }
    }
}
