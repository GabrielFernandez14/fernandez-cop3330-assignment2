/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex24.base;

import java.util.Arrays;

public class AnagramDetector {
    // isAnagram function
    public boolean isAnagram(String word1, String word2) {
        // "Delete" all space characters and make both strings lower case
        String copy1 = word1.replaceAll("\\s", "").toLowerCase();
        String copy2 = word2.replaceAll("\\s", "").toLowerCase();

        // Check if string length is equal, if not, return false
        if (copy1.length() != copy2.length()) {
            return false;
        }
        // If string length is equal, continue
        else {
            // Create a character array of the strings stored in copy vars
            char[] copy1Arr = copy1.toCharArray();
            char[] copy2Arr = copy2.toCharArray();

            // Sort each character array alphabetically
            Arrays.sort(copy1Arr);
            Arrays.sort(copy2Arr);

            // If the arrays are equal, that means we have an anagram
            // so return true, if not, return false
            return Arrays.equals(copy1Arr, copy2Arr);
        }
    }
}
