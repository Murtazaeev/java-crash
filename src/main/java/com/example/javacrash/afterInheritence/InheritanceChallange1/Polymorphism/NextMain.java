package com.example.javacrash.afterInheritence.InheritanceChallange1.Polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure)  Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        var airplane = Movie.getMovie("Airplane", "Airplanes");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchMovie();

    }
}
