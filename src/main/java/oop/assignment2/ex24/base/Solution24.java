/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex24.base;

// Import scanner
import java.util.Scanner;

public class Solution24 {
    // Declare scanner variable and strings for words
    private static final Scanner input = new Scanner(System.in);

    private static String word1;
    private static String word2;

    // Main function
    public static void main(String[] args) {
        // Call getInput function
        getInput();

        // Create a new AnagramDetector operator
        AnagramDetector ad = new AnagramDetector();
        // The result of isAnagram function gets stored in a boolean
        boolean result = ad.isAnagram(word1, word2);

        // Decide output by passing in result
        String output = getOutput(result);
        System.out.println(output);
    }

    // Prompt the user with the problem and scan in their input to word1 and word2
    public static void getInput() {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first string: ");
        word1 = input.nextLine();

        System.out.print("Enter the second string: ");
        word2 = input.nextLine();
    }

    // Return exit strings depending on whether result is true or false
    public static String getOutput(boolean result) {
        if(result) {
            return "\"" + word1 + "\" and " + "\"" + word2 + "\"" + " are anagrams.";
        }
        else {
            return "\"" + word1 + "\" and " + "\"" + word2 + "\"" + " are not anagrams.";
        }
    }
}
