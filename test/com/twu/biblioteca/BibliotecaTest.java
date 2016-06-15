package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
    private Biblioteca biblioteca;
    private List<Book> bookList;

    @Before
    public void setUp() {
        bookList = new ArrayList<Book>();
        bookList.add(new Book("xiaoqi", "time", "2014-5", 9992342, true));
        biblioteca = new Biblioteca(bookList);
        bytes = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bytes));
    }

    private ByteArrayOutputStream bytes;

    @Test
    public void shouldShowWelcomeMessageWhenStartTheApplication() throws Exception {
        biblioteca.showWelcomeMessage();
        assertEquals("welcome to Biblioteca\n", bytes.toString());

    }

    @Test
    public void shouldShowAllLibraryBooksAfterWelcomeMessage() throws Exception {
        biblioteca.showAllLibraryBooks(bookList);
        assertEquals("bookName=time, author=xiaoqi,isbn=9992342, publishDate=2014-5\n", bytes.toString());
    }


}
