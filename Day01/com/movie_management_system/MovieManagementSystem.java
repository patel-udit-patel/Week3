package com.movie_management_system;

import java.util.Scanner;
public class MovieManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieList list = new MovieList();

        list.addAtEnd("Inception", "Christopher Nolan", 2013, 8.8);
        list.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        list.addAtEnd("The Dark Knight", "Christopher Nolan", 2015, 9.0);

        System.out.println("Movie Records:");
        list.displayForward();

        System.out.println("Searching for movies by Christopher Nolan:");
        list.searchByDirectorOrRating("Christopher Nolan", -1);

        System.out.println("Updating rating for Inception to 9.0:");
        list.updateRating("Inception", 9.0);
        list.displayForward();

        System.out.println("Removing The Dark Knight:");
        list.removeByTitle("The Dark Knight");
        list.displayForward();

        System.out.println("Movies in Reverse Order:");
        list.displayReverse();

        scanner.close();
    }
}
