/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex26.base;

// Import scanner
import java.util.Scanner;

public class Solution26 {
    // Declare constants and scanner variables
    private static final Scanner in = new Scanner(System.in);

    private static double balance;
    private static double apr;
    private static double monthlyPay;

    // Main function
    public static void main(String[] args) {
        // Call getInput() to get input from the user
        getInput();

        // Initialize a new instance of Class PaymentCalculator
        PaymentCalculator pc = new PaymentCalculator();
        double numMonths = pc.calculateMonthsUntilPaidOff(balance, apr, monthlyPay);

        // Typecast months to an integer value
        int numMonthsInt = (int)numMonths;

        // Print exit statement with the rounded calculation
        System.out.println("It will take you " + numMonthsInt + " months to pay off this card.");
    }

    // Prompt user for their inputs and store inside their respective variables
    public static void getInput() {
        System.out.print("What is your balance? ");
        balance = in.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        monthlyPay = in.nextDouble();
    }
}
