package com.twu.biblioteca;

import com.twu.biblioteca.menus.ListBooks;
import com.twu.biblioteca.menus.Option;
import com.twu.biblioteca.menus.Quit;

import java.util.ArrayList;

public class BibliotecaApp {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("xiaoqi", "time", "2014-5", 9992342, true));
        ArrayList<Option> optionList = new ArrayList<Option>();
        optionList.add(new ListBooks("ShowAllBook", 1));
        optionList.add(new Quit("Quit", 2));
        Biblioteca biblioteca = new Biblioteca(bookList, optionList);
        biblioteca.start();

    }
}
