/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex29.base;

// Import scanner and math library
import java.util.Scanner;
import java.lang.Math;

public class Solution29 {
    // Declare scanner public variable
    public static final Scanner in = new Scanner(System.in);

    // Main function calls getYears() and that's it
    public static void main(String[] args) {
        int years = getYears();

        System.out.println("It will take " + years +
                " years to double your initial investment.");
    }

    // Gets the number of years from the user
    public static int getYears() {
        // Declare input as a string since then we can use
        // .parseInt later to make my life easier
        String input;
        double total;

        // Initial prompt
        System.out.print("What is the rate of return? ");
        input = in.nextLine();

        // while the result of isNum() is false, and the user did
        // not input 0, this loop will continue
        while (!isNum(input) || input.equals("0")) {
            System.out.println("Sorry. That's not a valid input.");
            System.out.print("What is the rate of return? ");
            input = in.nextLine();
        }

        // The user must have entered valid input, so we can calculate
        double num = Double.parseDouble(input);
        total = 72.0 / num;

        // Return the value as a rounded integer via typecast
        return (int) Math.round(total);
    }

    // Boolean function that verifies if the string inputted
    // is a number
    public static boolean isNum(String input) {
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException e) {
            // The input is not an integer
            return false;
        }

        // If we make it past the try-catch statement,
        // our input is a number
        return true;
    }
}
