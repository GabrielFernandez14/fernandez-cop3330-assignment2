/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex27.base;

// Import scanner
import java.util.Scanner;

public class Solution27 {
    // Declare scanner operators and public variables
    public static final Scanner in = new Scanner(System.in);

    public static String fName;
    public static String lName;
    public static String zip;
    public static String id;

    // Main function
    public static void main(String[] args) {
        // Get input from the user via prompts and store inside
        // public vars
        getInput();

        // Create a new instance of Class ValidateIn and call
        // validateInput function
        ValidateIn vi = new ValidateIn();
        String output = vi.validateInput(fName, lName, zip, id);

        // Print the output
        System.out.print(output);
    }

    // Prompt for input from the user and store inside public vars
    public static void getInput() {
        System.out.print("Enter the first name: ");
        fName = in.nextLine();

        System.out.print("Enter the last name: ");
        lName = in.nextLine();

        System.out.print("Enter the ZIP code: ");
        zip = in.nextLine();

        System.out.print("Enter the employee ID: ");
        id = in.nextLine();
    }
}

