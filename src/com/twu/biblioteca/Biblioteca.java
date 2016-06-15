package com.twu.biblioteca;

import com.twu.biblioteca.menus.Option;

import java.util.List;

public class Biblioteca {
    private List<Book> bookList;
    private List<Option> optionList;

    Biblioteca(List<Book> bookList, List<Option> optionList) {
        this.bookList = bookList;
        this.optionList = optionList;
    }

    void showWelcomeMessage() {
        consolePrint("welcome to Biblioteca");
    }

    private void consolePrint(String printContent) {
        System.out.println(printContent);
    }


    public void showAllLibraryBooks() {
        for (Book book : bookList) {
            consolePrint(book.showBook());
        }
    }

    void showMenu() {
        for (Option option : optionList) {
            consolePrint(option.getMenuString());
        }
    }
}
