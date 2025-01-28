package com.library_management_system;

import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList list = new BookList();

        list.addAtEnd("Maths", "RD Sharma", "Fun",123, true);
        list.addAtEnd("Physics", "Issac Newton", "Poetry",345, true);
        list.addAtEnd("Chemistry", "Darwin", "Mental Peace", 456,true);

        System.out.println("Book Records:");
        list.displayForward();

        System.out.println();
        System.out.println("Searching for Book by Issac Newton:");
        list.searchByTitleOrAuthor("Physics", "Issac Newton");

        System.out.println();
        System.out.println("Updating Book availability to false:");
        list.updateAvailability("Maths", false);
        list.displayForward();

        System.out.println();
        System.out.println("Removing a book with bookId 456:");
        list.removeByBookId(456);
        list.displayForward();

        System.out.println();
        System.out.println("Books in Reverse Order:");
        list.displayReverse();

        System.out.println();
        System.out.println("Displaying total number of books in library");
        list.countBooks();

        scanner.close();
    }
}
