package com.twu.biblioteca.menus;

import com.twu.biblioteca.Biblioteca;

public class returnBook extends Option {
    public returnBook(String name, int id) {
        super(name, id);
    }

    @Override
    public void run(Biblioteca biblioteca) {
        biblioteca.returnBook();
        biblioteca.showMenu();
    }
}
