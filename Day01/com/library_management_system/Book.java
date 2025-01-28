package com.library_management_system;

//This is a node class to define book for bookList
public class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean availability;
    Book next;
    Book prev;

    Book(String title,String author,String genre,int bookId,boolean availability){
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.bookId=bookId;
        this.availability=availability;
        this.next=null;
        this.prev=null;
    }
}
