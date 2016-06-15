package com.twu.biblioteca;

import com.twu.biblioteca.menus.*;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("xiaoqi", "time", "2014-5", 1, true));
        bookList.add(new Book("xiaoq1i", "timess", "2014-5", 2, true));
        ArrayList<Option> optionList = new ArrayList<Option>();
        optionList.add(new ListBooks("ShowAllBook", 1));
        optionList.add(new checkoutBook("checkoutBook", 2));
        optionList.add(new returnBook("returnBook", 3));
        optionList.add(new Quit("Quit", 4));
        Biblioteca biblioteca = new Biblioteca(bookList, optionList);
        biblioteca.start();

    }
}
