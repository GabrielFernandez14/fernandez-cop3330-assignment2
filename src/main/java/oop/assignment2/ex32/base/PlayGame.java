/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex32.base;

// Import required thingamajigs
import java.util.Random;
import java.util.Scanner;

public class PlayGame {
    // Declare scanner operator as a public constant
    public static final Scanner in = new Scanner(System.in);

    // The actual meat of the code
    public void playGuessingGame(int difficulty) {
        // Declare required variables and instances
        int max = 0, guessCounter = 0, target;
        Random rand = new Random();
        String guess;

        // The following if statements determine
        // the upper bound of what the number can
        // be based on the difficulty input
        if (difficulty == 1) {
            max = 10;
        }

        if (difficulty == 2) {
            max = 100;
        }

        if (difficulty == 3) {
            max = 1000;
        }

        // Randomly select a number between 1 and max, then
        // prompt the user for their first guess
        target = rand.nextInt(max) + 1;
        System.out.print("I have my number. What's your guess? ");
        guessCounter++;
        guess = in.nextLine();

        // If the user's first guess is not a number, loop
        // until they input a number
        while(!isNum(guess)) {
            System.out.print("Not a number. Guess again: ");
            // We need to increment guessCounter for non numeric
            // inputs according to the constraints
            guessCounter++;
            guess = in.nextLine();
        }

        // The user has inputted a number, store inside guessInt
        int guessInt = Integer.parseInt(guess);

        // If the user guessed correctly on their first try
        // print the exit statement with appropriate grammar
        if (guessInt == target) {
            System.out.println("You got it in " + guessCounter + " guess!");
        }

        // Loop until guessInt is equal to the target number
        // that we generated earlier
        while(guessInt != target) {
            // If the input is a number
            if (isNum(guess)) {
                // Set that number to guessInt so that
                // it is read as an int, not a String
                guessInt = Integer.parseInt(guess);

                // If the user's guess is below the target
                // prompt them with "Too low."
                if (guessInt < target) {
                    System.out.print("Too low. Guess again: ");
                    guessCounter++;
                    guess = in.nextLine();
                }

                // If the user's guess is above the target
                // prompt them with "Too high."
                if (guessInt > target) {
                    System.out.print("Too high. Guess again: ");
                    guessCounter++;
                    guess = in.nextLine();
                }

                // If the user's guess is equal to the target
                // print the exit statement with the number of
                // guesses
                if (guessInt == target) {
                    System.out.println("You got it in " + guessCounter + " guesses!");
                }
            }

            // If what the user inputted was not a number, loop
            // until they input a number
            else {
                while(!isNum(guess)) {
                    System.out.print("Not a number. Guess again: ");
                    guessCounter++;
                    guess = in.nextLine();
                }
            }
        }
    }

    // Just checks via boolean if the user's input
    // is numeric by using Integer.parseInt()
    public static boolean isNum(String guess) {
        try {
            Integer.parseInt(guess);
        } catch (NumberFormatException e) {
            // The input is not an integer
            return false;
        }

        return true;
    }
}
