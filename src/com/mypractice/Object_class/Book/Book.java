package com.mypractice.Object_class.Book;

import java.util.Objects;

public class Book {
    String title;
    String author;
    int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublished);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (!(object instanceof Book)) return false;
        Book book = (Book) object;
        return this.title.equals(book.title) && this.author.equals(book.author) &&
                this.yearPublished == book.yearPublished;
    }
}
