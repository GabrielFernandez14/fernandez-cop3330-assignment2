/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex31.base;

// Import scanner
import java.util.Scanner;


public class Solution31 {
    // Declare scanner operator and initialize public vars
    public static final Scanner in = new Scanner(System.in);

    public static String pulse, age;

    // Main function
    public static void main(String[] args) {
        // Prompt the user for input
        getInput();

        double pulseNum = Double.parseDouble(pulse);
        int ageNum = Integer.parseInt(age);

        // Print a new line
        System.out.println();

        // Create a new instance of CreateTable()
        // and run calculateAndPrint(pulse, age)
        CreateTable ct = new CreateTable();
        ct.calculateAndPrint(pulseNum, ageNum);
    }

    // Get input from the user, do not allow
    // invalid inputs
    public static void getInput() {
        System.out.print("Resting Pulse: ");
        pulse = in.nextLine();

        while (!isNum(pulse) || pulse.equals("0")) {
            if (pulse.equals("0")) {
                System.out.println("You are literally dead. Please try again.");
            }
            else {
                System.out.println("Sorry. Please enter a numerical value.");
            }
            System.out.print("Resting Pulse: ");
            pulse = in.nextLine();
        }

        System.out.print("Age: ");
        age = in.nextLine();

        while (!isNum(age) || age.equals("0")) {
            if (age.equals("0")) {
                System.out.println("You are literally a zygote. Please try again.");

            }
            else {
                System.out.println("Sorry. Please enter a numerical value.");
            }

            System.out.print("Age: ");
            age = in.nextLine();
        }
    }

    // Boolean function that verifies if the string inputted
    // is a number
    // I still don't get why I am getting a warning that says
    // it's always inverted, even if it is a warning, it still
    // works as intended so I'm just going to continue ignoring
    // the warning
    public static boolean isNum(String s) {
        try {
            Double.parseDouble(s);
        } catch (NumberFormatException e) {
            // The input is not an integer
            return false;
        }

        // If we make it past the try-catch statement,
        // our input is a number
        return true;
    }
}
