package com.library_management_system;

//This class for define list of books and functionalities
public class BookList {
    private Book head;
    private Book tail;

    //Add a movie at the beginning
    public void addAtBeginning(String title, String author,String genre, int bookId,boolean availability) {
        Book newBook = new Book(title, author, genre,bookId,availability);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    //Add a book at the end
    public void addAtEnd(String title, String author,String genre, int bookId,boolean availability) {
        Book newBook = new Book(title, author,genre, bookId, availability);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Remove a book by bookId
    public void removeByBookId(int bookId) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId==(bookId)) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    //Search for a movie by director or rating
    public void searchByTitleOrAuthor(String title,String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title) || temp.author.equalsIgnoreCase(author)) {
                System.out.println("Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId+ ", Availability: "+temp.availability);
            }
            temp = temp.next;
        }
    }

    // Display movies in forward order
    public void displayForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId+ " ,Availability: "+temp.availability);
            temp = temp.next;
        }
    }

    //Display movies in reverse order
    public void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookId+ " ,Availability: "+temp.availability);
            temp = temp.prev;
        }
    }

    //Update a movie's rating based on title
    public void updateAvailability(String title, boolean availability) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.availability = availability;
                return;
            }
            temp = temp.next;
        }
    }

    public void countBooks(){
        Book temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
    }
}
