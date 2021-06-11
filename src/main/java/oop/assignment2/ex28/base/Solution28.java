/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

/*
    Scuffed FlowChart:
Main                    |--------> getInput()
|                       |               |
\/                      |               \/
Declare sum             |           Initialize sum to 0
|                       |               |
\/                      |               \/
Call getInput() --------|           For loop such that i starts at  <----------------|
and store result in sum             0 and doesn't exceed 5 (once i == 5              |
|                                   (we can exit, because 5 < 5 is false             |
|                                   |    |                                           |
|                                   |    \/                                          |
\/                                  |    Prompt user for a number                    |
Print sum and exit                  |    |                                  Increment i
                                    |    \/                                          |
                                    |    Store number inside sum using +=            |
                                    |    so that each number is being                |
                                    |    added as the loop progresses                |
                                    |    |                                           |
                                    |    |-------------------------------------------|
                                    |
                                    \/
                                    Return sum
 */

package oop.assignment2.ex28.base;

// Import scanner
import java.util.Scanner;

public class Solution28 {
    // Initialize scanner
    public static final Scanner in = new Scanner(System.in);

    // Main function
    public static void main(String[] args) {
        // Call getSum() and store result in sum
        int sum = getSum();

        // Print out the sum
        System.out.println("The total is " + sum + ".");
    }

    // getSum() unsurprisingly gets the sum
    public static int getSum() {
        // Initialize at 0
        int sum = 0;

        // Loop 5 times, Prompting the user
        // and storing their input inside of
        // sum each time
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            // The += allows each number to be added
            // into sum each loop, calculating the sum
            // as it loops
            sum += in.nextInt();
        }

        // Return final sum
        return sum;
    }
}
