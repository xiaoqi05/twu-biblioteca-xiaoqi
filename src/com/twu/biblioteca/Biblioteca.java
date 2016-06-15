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
        if (!checkMenuInputIsValid(userInput)) {
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

    private boolean checkMenuInputIsValid(String input) {
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
        consolePrint("ShowAllBooks :\n");
        for (Book book : bookList) {
            if (book.isInLibrary()) {
                consolePrint(book.showBook() + "\n");
            }
        }
    }

    public void showMenu() {
        for (Option option : optionList) {
            consolePrint(option.getMenuString() + "  ");
        }
        consolePrint("\n");
    }

    private boolean isNumeric(String str) {
        if (str.equals("")) return false;
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public void quit() {
        this.isRunning = false;
        consolePrint("Quit");
    }

    public void checkoutBook() {
        consolePrint("checkout book by isbn:\n");
        String userInput = scanner.nextLine();
        if (!isNumeric(userInput) || userInput.equals("")) {
            showCheckOutUnSuccessMessage();
            return;
        }
        boolean isValidBook = false;
        for (Book book : bookList) {
            if (book.getIsbn() == Integer.parseInt(userInput)) {
                isValidBook = true;
                boolean isCheckoutSuccess = book.checkOutBook();
                if (isCheckoutSuccess) {
                    consolePrint("you have checkout this book:\n" + book.showBook() + "\n");
                    showCheckOutSuccessMessage();
                } else {
                    showCheckOutUnSuccessMessage();
                }
            }
        }
        if (!isValidBook) {
            showCheckOutUnSuccessMessage();
        }
    }

    private void showCheckOutUnSuccessMessage() {
        consolePrint("That book is not available\n");
    }

    private void showCheckOutSuccessMessage() {
        consolePrint("Thank you! Enjoy the book\n");
    }

    public void returnBook() {
        consolePrint("return book by isbn:\n");
        String userInput = scanner.nextLine();
        if (!isNumeric(userInput) || userInput.equals("")) {
            showReturnUnSuccessMessage();
            return;
        }
        boolean isValidBook = false;
        for (Book book : bookList) {
            if (book.getIsbn() == Integer.parseInt(userInput)) {
                isValidBook = true;
                boolean isReturnSuccess = book.returnBook();
                if (isReturnSuccess) {
                    consolePrint("you have return this book:\n" + book.showBook() + "\n");
                    showReturnSuccessMessage();
                } else {
                    showReturnUnSuccessMessage();
                }
            }
        }
        if (!isValidBook) {
            showReturnUnSuccessMessage();
        }
    }

    private void showReturnUnSuccessMessage() {
        consolePrint("That is not a valid book to return\n");
    }

    private void showReturnSuccessMessage() {
        consolePrint("Thank you for returning the book\n");
    }
}
