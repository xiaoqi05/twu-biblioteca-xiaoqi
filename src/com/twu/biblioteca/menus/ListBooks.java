package com.twu.biblioteca.menus;

import com.twu.biblioteca.Biblioteca;

public class ListBooks extends Option {

    public ListBooks(String name, int id) {
        super(name, id);
    }

    @Override
    public void run(Biblioteca biblioteca) {
        biblioteca.showAllLibraryBooks();
        biblioteca.showMenu();
    }
}
