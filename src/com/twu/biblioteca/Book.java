package com.twu.biblioteca;

public class Book {
    private String author;
    private String bookName;
    private String publishDate;
    private int isbn;
    private boolean isInLibrary;

    public Book(String author, String bookName, String publishDate, int isbn, boolean isInLibrary) {
        this.author = author;
        this.bookName = bookName;
        this.publishDate = publishDate;
        this.isbn = isbn;
        this.isInLibrary = isInLibrary;
    }

    public String showBook() {
        return "bookName=" + bookName +
                ", author=" + author +
                ",isbn=" + isbn +
                ", publishDate=" + publishDate;
    }

    public boolean checkOutBook() {
        if (!isInLibrary) return false;
        isInLibrary = false;
        return true;
    }

    public boolean returnBook() {
        if (isInLibrary) return false;
        isInLibrary = true;
        return true;
    }

}
