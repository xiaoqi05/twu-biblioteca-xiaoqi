package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Test
    public void shouldReturnTrueWhenCheckoutSuccess() throws Exception {
        book = new Book("xiaoqi", "time", "2014-5", 9992342, true);
        boolean result = book.checkOutBook();
        assertEquals(true, result);
        assertEquals(false, book.isInLibrary());
    }

    @Test
    public void shouldReturnFalseWhenCheckoutUnSuccess() throws Exception {
        book = new Book("xiaoqi", "time", "2014-5", 9992342, false);
        boolean result = book.checkOutBook();
        assertEquals(false, result);
        assertEquals(false, book.isInLibrary());
    }

    @Test
    public void shouldReturnTrueWhenReturnSuccess() throws Exception {
        book = new Book("xiaoqi", "time", "2014-5", 9992342, false);
        boolean result = book.returnBook();
        assertEquals(true, result);
        assertEquals(true, book.isInLibrary());
    }

    @Test
    public void shouldReturnFalseWhenReturnUnSuccess() throws Exception {
        book = new Book("xiaoqi", "time", "2014-5", 9992342, true);
        boolean result = book.returnBook();
        assertEquals(false, result);
        assertEquals(true, book.isInLibrary());
    }
}
