package com.mypractice.Object_class.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("War and Piece", "Tolstoy", 1830);
        Book book1 = new Book("War and Piece", "Tolstoy", 1830);
        Book book2 = new Book("Idiot", "Dostoevsky", 1880);

        if (book.hashCode() == book1.hashCode()) {
            System.out.println(book.equals(book1));
        }
        if (book.hashCode() == book2.hashCode()) {
            System.out.println(book.equals(book2));
        }
    }
}
