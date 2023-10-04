package com.example.javacrash.afterInheritence.InheritanceChallange1.Polymorphism;

public class NextMain {
    public static void main(String[] args) {
//        Movie movie = Movie.getMovie("A", "Jaws");
//        movie.watchMovie();
//
//        Adventure jaws = (Adventure)  Movie.getMovie("A", "Jaws");
//        jaws.watchMovie();
//
//        var airplane = Movie.getMovie("Airplane", "Airplanes");
//        airplane.watchMovie();
//
//        var plane = new Comedy("Airplane");
//        plane.watchMovie();


        Object unknownObject = Movie.getMovie("C", "Jaws");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof Fiction syfy) {
            syfy.watchFiction();
        }

    }
}
