package com.bookdatabase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookDatabase database = new BookDatabase();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nBook Database Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter Published Year: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Genre: ");
                    String genre = scanner.nextLine();
                    database.addBook(new Book(title, author, isbn, year, genre));
                    break;
                case "2":
                    database.viewBooks();
                    break;
                case "3":
                    System.out.print("Enter the title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    Book book = database.searchBook(searchTitle);
                    if (book != null) {
                        System.out.println(book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case "4":
                    System.out.print("Enter the title of the book to delete: ");
                    String deleteTitle = scanner.nextLine();
                    database.deleteBook(deleteTitle);
                    break;
                case "5":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (!choice.equals("5"));

        scanner.close();
    }
}
