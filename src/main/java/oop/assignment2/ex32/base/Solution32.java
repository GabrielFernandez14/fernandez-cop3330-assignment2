/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex32.base;

// Import scanner
import java.util.Scanner;

public class Solution32 {
    // Declare scanner as a public constant
    public static final Scanner in = new Scanner(System.in);

    // Main function
    public static void main(String[] args) {
        // Initial print
        System.out.println("Let's play Guess the Number!\n");

        // Prompt user for difficulty; looping until
        // the user enters a valid input
        int difficulty = promptDifficulty();
        String continueGame;

        // Create a new instance of class PlayGame and
        // run the first game
        PlayGame pg = new PlayGame();
        pg.playGuessingGame(difficulty);

        // After the user has completed the first game
        // ask them if they want to play again
        System.out.println();
        System.out.print("Do you wish to play again (Y/N)? ");
        continueGame = in.nextLine();

        // Loop until the user responds to the above prompt
        // with either "n" or "N"
        while (!(continueGame.equals("n") || continueGame.equals("N"))) {
            // If the user entered yes, run the game again
            if (continueGame.equals("Y") || continueGame.equals("y")) {
                System.out.println();
                // Prompt the user for the difficulty
                // and run playGuessingGame() again
                difficulty = promptDifficulty();
                pg.playGuessingGame(difficulty);
                System.out.println();
            }

            // If the user did not enter yes (as checked
            // by the if statement) or did not enter no
            // (as checked by the while loop), that means
            // their input was invalid
            else {
                System.out.println("Please enter either Y or N.");
            }

            // If we made it here, the user has completed
            // another game already
            System.out.print("Do you wish to play again (Y/N)? ");
            continueGame = in.nextLine();
        }
    }

    // Prompt the user for difficulty, disallowing
    // any response that is not 1, 2, or 3
    public static int promptDifficulty() {
        String difficulty;

        // Initial prompt
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        difficulty = in.nextLine();

        // These constraints are very inefficient but it works,
        // don't judge me too harshly I tried okay ;-;
        while (!(difficulty.equals("1") || difficulty.equals("2")
                || difficulty.equals("3"))) {
            // If the user did not enter 1, 2, or 3; prompt them again
            System.out.println("Please enter either 1, 2, or 3.");
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            difficulty = in.nextLine();
        }

        // The user entered 1, 2, or 3; so return that
        // value as an integer
        return Integer.parseInt(difficulty);
    }
}
