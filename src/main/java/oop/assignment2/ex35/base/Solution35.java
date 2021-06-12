/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex35.base;

// Import scanner
import java.util.Scanner;

public class Solution35 {
    // Declare scanner var
    public static final Scanner in = new Scanner(System.in);

    // Main function
    public static void main(String[] args) {
        // Declare a new instance of PickWinner and
        // store the resultant string inside of winner
        PickWinner pw = new PickWinner();
        String winner = pw.pickWinnerRandomly();

        // Print exit statement
        System.out.printf("The winner is... %s.", winner);
    }
}
