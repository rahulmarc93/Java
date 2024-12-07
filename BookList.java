package oop;

import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println("---------------------------");
    }
}

public class BookList {
    public static void main(String[] args) {
        // Create an ArrayList of Book objects
        ArrayList<Book> books = new ArrayList<>();

        // Add Book objects to the ArrayList
        books.add(new Book(101, "The Alchemist", "Paulo Coelho"));
        books.add(new Book(102, "1984", "George Orwell"));
        books.add(new Book(103, "To Kill a Mockingbird", "Harper Lee"));

        // Display all book details using an advanced for loop
        System.out.println("Book Details:");
        for (Book book : books) {
            book.displayBookDetails();
        }
    }
}
