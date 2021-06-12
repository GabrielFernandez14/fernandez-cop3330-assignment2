/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex35.base;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.Random;

public class PickWinner {
    // Declare scanner constant
    public static final Scanner in = new Scanner(System.in);

    // Uses an ArrayList to scan inputs until ""
    // is entered, then randomly selects an input
    // that is not "" to be returned
    public String pickWinnerRandomly() {
        // Initialize ArrayList, randomizer, curString, and counter
        ArrayList<String> contestants = new ArrayList<>();
        Random rand = new Random();
        String curString;
        int counter = 0;

        // Initial prompt
        System.out.print("Enter a name: ");
        contestants.add(in.nextLine());
        curString = contestants.get(counter);
        counter++;

        // While the inputted string is not ""
        while (!curString.equals("")) {
            // Prompt the user for a name and store inside
            // the ArrayList
            System.out.print("Enter a name: ");
            contestants.add(in.nextLine());
            // curString holds the current String so that
            // it can be compared against "" using .equals()
            // in the while loop's constraint
            curString = contestants.get(counter);
            // Increment counter
            counter++;
        }

        // This means the user's first input was ""
        if (counter == 1) {
            return "[No winner is possible]";
        }
        else {
            // Find random index at bound - 1 so that "" is not
            // a possible winner
            int winner = rand.nextInt(counter - 1);

            // Return the String that is being held in the ArrayList
            // at index winner
            return contestants.get(winner);
        }
    }
}