package com.twu.biblioteca;

import com.twu.biblioteca.menus.Option;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Biblioteca {
    private List<Book> bookList;
    private List<Option> optionList;
    private Scanner scanner = new Scanner(System.in);
    private boolean isRunning = true;

    Biblioteca(List<Book> bookList, List<Option> optionList) {
        this.bookList = bookList;
        this.optionList = optionList;
    }

    void start() {
        showWelcomeMessage();
        showAllLibraryBooks();
        showMenu();
        showMenuChoseNote();
        while (isRunning) {
            showOptionAccordingToInput();
        }
    }

    private void showOptionAccordingToInput() {
        String userInput = scanner.nextLine();
        if (!checkInputIsValid(userInput)) {
            showErrorInputMessage();
            return;
        }
        int userInputMenuId = Integer.parseInt(userInput);
        for (Option option : optionList) {
            if (option.getId() == userInputMenuId) {
                option.run(this);
            }
        }

    }

    private boolean checkInputIsValid(String input) {
        if (isNumeric(input)) {
            int inputMenuId = Integer.parseInt(input);
            return !(inputMenuId <= 0 || inputMenuId > optionList.size());
        } else {
            return false;
        }
    }

    private void showMenuChoseNote() {
        consolePrint("please input menu id:\n");
    }


    private void showErrorInputMessage() {
        consolePrint("Select a valid option!\n");
    }

    void showWelcomeMessage() {
        consolePrint("welcome to Biblioteca\n");
    }

    private void consolePrint(String printContent) {
        System.out.print(printContent);
    }


    public void showAllLibraryBooks() {
        for (Book book : bookList) {
            consolePrint(book.showBook());
        }
        consolePrint("\n");
    }

    void showMenu() {
        for (Option option : optionList) {
            consolePrint(option.getMenuString() + "  ");
        }
        consolePrint("\n");
    }

    private boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public void quit() {
        this.isRunning = false;
        consolePrint("Quit");
    }
}
