package com.example.javacrash.afterInheritence.InheritanceChallange1.AllAboutString;

public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Birth month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "20", "08", "1999");
        System.out.println(newDate);

        newDate = "20";
        newDate = newDate.concat("/");
        newDate = newDate.concat("08");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1999");
        System.out.println(newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println(newDate);
    }
}
