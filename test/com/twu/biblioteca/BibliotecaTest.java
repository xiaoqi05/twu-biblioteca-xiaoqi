package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BibliotecaTest {
    private Biblioteca biblioteca;
    private ByteArrayOutputStream bytes;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
        bytes = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bytes));
    }

    @Test
    public void shouldShowWelcomeMessageWhenStartTheApplication() throws Exception {
        biblioteca.showWelcomeMessage();
        Assert.assertEquals("welcome to Biblioteca\n", bytes.toString());

    }

}
