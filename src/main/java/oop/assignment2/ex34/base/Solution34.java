/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex34.base;

// Import scanner
import java.util.Scanner;

public class Solution34 {
    // Declare scanner operator and array of strings
    // as public constants
    public static final Scanner in = new Scanner(System.in);
    public static final String [] employees = {"John Smith",
            "Jackie Jackson", "Chris Jones", "Amanda Cullen",
            "Jeremy Goodwin"};

    // One line mains are my favorites
    public static void main(String[] args) {
        printEmployees();
    }

    // Prints the before and after of the employees
    public static void printEmployees() {
        int flag = 0;

        System.out.println("There are 5 employees:");

        // Print all employees in the array
        for (int i = 0; i < 5; i++) {
            System.out.println(employees[i]);
        }

        // Store the string inputted by the user
        // in remove
        String remove = removeEmployee();
        System.out.println();

        // Formatting
        if (remove != null) {
            for (int i = 0; i < 5; i++) {
                if (employees[i].equals(remove)) {
                    System.out.println("There are 4 employees:");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("There are 5 employees:");
            }
        }

        for (int i = 0; i < 5; i++) {
            // If the string at i is equal to the
            // string that is to be removed, don't
            // print it
            if (!employees[i].equals(remove)) {
                System.out.println(employees[i]);
            }
        }
    }

    // Prompt the user to input the name they want
    // to remove
    public static String removeEmployee() {
        System.out.println();
        System.out.print("Enter an employee name to remove: ");
        return in.nextLine();
    }
}
