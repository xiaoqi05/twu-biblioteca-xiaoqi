package com.twu.biblioteca;

import com.twu.biblioteca.menus.ListBooks;
import com.twu.biblioteca.menus.Option;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
    private Biblioteca biblioteca;
    private List<Book> bookList;
    private List<Option> optionList;

    @Before
    public void setUp() {
        bookList = new ArrayList<Book>();
        bookList.add(new Book("xiaoqi", "time", "2014-5", 9992342, true));
        optionList = new ArrayList<Option>();
        optionList.add(new ListBooks("ShowAllBook", 1));
        biblioteca = new Biblioteca(bookList, optionList);
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
        biblioteca.showAllLibraryBooks();
        assertEquals("ShowAllBooks :\n" + "bookName=time, author=xiaoqi,isbn=9992342, publishDate=2014-5\n", bytes.toString());
    }

    @Test
    public void shouldShowMenu() throws Exception {
        biblioteca.showMenu();
        assertEquals("1:ShowAllBook  \n", bytes.toString());

    }
}
