package com.bookdatabase;

import java.util.ArrayList;
import java.util.List;

public class BookDatabase {
    private List<Book> books;

    // Constructor
    public BookDatabase() {
        books = new ArrayList<>();
    }

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // View all books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the database.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Search for a book by title
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Delete a book by title
    public boolean deleteBook(String title) {
        Book book = searchBook(title);
        if (book != null) {
            books.remove(book);
            System.out.println("Book deleted: " + title);
            return true;
        } else {
            System.out.println("Book not found: " + title);
            return false;
        }
    }
}

