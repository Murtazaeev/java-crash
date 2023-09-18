package com.example.javacrash.Methods;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.printf("Invalid Number");
        }else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            // kiloBytes / 1024
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}





//        TIP: Use the remainder operator
//        TIP: 1 MB = 1024 KB
