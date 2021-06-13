/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex38.base;

// Import required libraries
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Solution38 {
    // Declare scanner variable as a public constant
    public final static Scanner in = new Scanner(System.in);

    // Main function
    public static void main(String[] args) {
        // Get initial array
        int [] numbers = getInput();

        // Get filtered array
        int [] evenNumbers = filterEvenNumbers(numbers);

        // Exit statement
        System.out.print("The even numbers are");
        for (int i : evenNumbers) {
            System.out.print(" " + i);
        }
        System.out.print(".\n");
    }

    // Prompt user for input
    public static int [] getInput() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String str = in.nextLine();

        // Return converted array; regex of " " ignores spaces;
        // parseInt turns string values into Integers
        return Arrays.stream(str.split(" ")).
                mapToInt(Integer::parseInt).toArray();
    }

    // Filter old array and create a new one of only even
    // numbers
    public static int [] filterEvenNumbers(int [] array) {
        // Since we don't know the size of our array
        // using an ArrayList is the better choice
        List<Integer> evenList = new ArrayList<>();

        // If the value at array[i] is even
        // store in the ArrayList
        for (int i : array) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        // Now that our ArrayList is complete
        // we can find our size
        int size = evenList.size();

        // Store ArrayList values into an integer
        // array of size size
        int [] evenNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            evenNumbers[i] = evenList.get(i);
        }

        // Return integer array
        return evenNumbers;
    }
}
