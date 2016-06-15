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
        consolePrint("welcome to Biblioteca\n");
    }

    private void consolePrint(String printContent) {
        System.out.print(printContent);
    }


    public void showAllLibraryBooks() {
        for (Book book : bookList) {
            consolePrint(book.showBook());
        }
        consolePrint("\n");
    }

    void showMenu() {
        for (Option option : optionList) {
            consolePrint(option.getMenuString()+"  ");
        }
        consolePrint("\n");
    }
}
