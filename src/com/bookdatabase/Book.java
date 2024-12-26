package com.bookdatabase;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publishedYear;
    private String genre;

    // Constructor
    public Book(String title, String author, String isbn, int publishedYear, String genre) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.genre = genre;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getGenre() {
        return genre;
    }

    // To String for displaying book details
    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Published Year=" + publishedYear +
                ", Genre='" + genre + '\'' +
                '}';
    }
}
