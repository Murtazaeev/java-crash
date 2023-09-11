package com.example.javacrash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCrashApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaCrashApplication.class, args);

        short myMinShortVal = Short.MIN_VALUE;
        int myMinIntVal = Integer.MIN_VALUE;

        System.out.println(myMinIntVal +  myMinShortVal);

        // Challenge

        byte myByte = 120;
        short myShort = 1200;
        int myInt = 12000;
        long myLong = 50000L + 10 * (myInt + myByte + myShort);
        System.out.println(myByte);
        System.out.println(myInt);
        System.out.println(myShort);
        System.out.println(myLong);

        float myFloat = (float) 22.22;
        System.out.println(myFloat);
    }

}

