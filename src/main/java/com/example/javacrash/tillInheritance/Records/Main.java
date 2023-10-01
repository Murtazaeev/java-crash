package com.example.javacrash.tillInheritance.Records;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++) {
            LPAStudent s = new LPAStudent("s19354" + i,
                    switch (i) {
                        case 1 -> "Temur";
                        case 2 -> "Bobur";
                        case 3 -> "Boboyor";
                        case 4 -> "Gulnoza";
                        case 5 -> "Boxodir";
                        default -> "Anonymous";
                },
                    "20/08/1999",
                    "Java");

        System.out.println(s);
        }

    }
}
