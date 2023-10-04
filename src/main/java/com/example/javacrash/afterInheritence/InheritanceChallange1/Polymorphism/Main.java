package com.example.javacrash.afterInheritence.InheritanceChallange1.Polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Movie movie = Movie.getMovie("Adventure", "Star Wars");
//        movie.watchMovie();
//        List list = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for adventure, C for Comedy, F for Fiction) " +
                    " or Q to quit");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie title: ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
