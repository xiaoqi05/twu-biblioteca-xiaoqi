package com.twu.biblioteca.menus;

import com.twu.biblioteca.Biblioteca;

public class CheckoutBook extends Option {
    public CheckoutBook(String name, int id) {
        super(name, id);
    }

    @Override
    public void run(Biblioteca biblioteca) {
        biblioteca.checkoutBook();
        biblioteca.showMenu();
    }
}
