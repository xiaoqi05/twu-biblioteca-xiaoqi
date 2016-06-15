package com.twu.biblioteca;

import java.util.Date;

class Book {
    private String author;
    private String bookName;
    private String publishDate;
    private int isbn;
    private boolean isInLibrary;

    Book(String author, String bookName, String publishDate, int isbn, boolean isInLibrary) {
        this.author = author;
        this.bookName = bookName;
        this.publishDate = publishDate;
        this.isbn = isbn;
        this.isInLibrary = isInLibrary;
    }

    String showBook() {
        return "bookName=" + bookName +
                ", author=" + author +
                ",isbn=" + isbn +
                ", publishDate=" + publishDate;
    }

    /**
     * @return false means check fail means true check success
     */
    boolean checkOutBook() {
        if (!isInLibrary) return false;
        setInLibrary(false);
        return true;
    }

    /**
     * @return false means return fail means true return success
     */
    boolean returnBook() {
        if (isInLibrary) return false;
        setInLibrary(true);
        return true;
    }


    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getBookName() {
        return bookName;
    }

    void setBookName(String bookName) {
        this.bookName = bookName;
    }

    String getPublishDate() {
        return publishDate;
    }

    void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    int getIsbn() {
        return isbn;
    }

    void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    boolean isInLibrary() {
        return isInLibrary;
    }

    private void setInLibrary(boolean inLibrary) {
        isInLibrary = inLibrary;
    }
}
