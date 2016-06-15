package com.twu.biblioteca.menus;

import com.twu.biblioteca.Biblioteca;

public abstract class Option {
    private String name;
    private int id;

    Option(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuString() {
        return id + ":" + name;
    }

    public abstract void run(Biblioteca biblioteca);
}
