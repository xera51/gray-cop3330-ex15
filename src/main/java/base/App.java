/*
 *  UCF COP3330 Summer 2021 Exercise 15 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);
    static final String PASSWORD = "abc$123";

    public static void main(String[] args) {
        App myApp = new App();

        String guess = myApp.readUserGuess();
        myApp.validatePassword(guess);
    }

    public String readUserGuess() {
        System.out.print("What is the password? ");
        return in.nextLine();
    }

    public void validatePassword(String guess) {
        if(guess.equals(PASSWORD)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
