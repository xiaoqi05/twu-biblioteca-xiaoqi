package com.twu.biblioteca;

import java.util.List;

class Biblioteca {
    private List<Book> bookList;

    Biblioteca(List<Book> bookList) {
        this.bookList = bookList;
    }

    void showWelcomeMessage() {
        consolePrint("welcome to Biblioteca");
    }

    private void consolePrint(String printContent) {
        System.out.println(printContent);
    }


    void showAllLibraryBooks(List<Book> bookList) {
        for (Book book : bookList) {
            consolePrint(book.showBook());
        }
    }
}
