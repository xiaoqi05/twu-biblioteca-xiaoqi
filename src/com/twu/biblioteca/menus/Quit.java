package com.twu.biblioteca.menus;

import com.twu.biblioteca.Biblioteca;

public class Quit extends Option {
    public Quit(String name, int id) {
        super(name, id);
    }

    @Override
    public void run(Biblioteca biblioteca) {
        biblioteca.quit();
    }
}
