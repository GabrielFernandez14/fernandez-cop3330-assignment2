/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// DISCLAIMER: This is probably the second (possibly first)
// ugliest code I've written for this assignment so far, apologies
// in advance

package oop.assignment2.ex37.base;

// Import required libraries and operators
import java.util.*;
import java.util.stream.Collectors;
import java.util.Random;

// I got this off GeeksForGeeks :)
public class GeneratePassword {
    public static List<Character> convertStringToCharList(String str) {
        // To be honest I have no idea what this means, but
        // it lets me turn a string into a character array list
        // so I like it
        return str.chars().mapToObj(e -> (char) e)
                .collect(Collectors.toList());
    }

    // The juicy function, I have no idea how specialChar and num
    // got swapped but they did somehow, so the parameters are not
    // the same as the call because it works somehow
    public String randomPassGenerator(int min, int num, int specialChar) {
        // Declare and initialize variables, create new instances
        // of required libraries and declare strings containing characters
        // needed for the generator
        int counterSpecial = 0, counterNum = 0, length;
        Random rand = new Random();
        StringBuilder pass = new StringBuilder();

        String abc = "abcdefghijklmnopqrstuvwxyz" +
                        "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // According to google, these are the special chars
        // that are traditionally allowed to be put in passwords
        String special = "$#@!%^&*()";
        String n = "0123456789";

        // Convert above strings into Character ArrayLists which
        // can then be used for randomization of what character
        // is being used for the password
        List<Character>
                chars = convertStringToCharList(abc);
        List<Character>
                chars1 = convertStringToCharList(n);
        List<Character>
                chars2 = convertStringToCharList(special);

        // Declare length so that there will always be
        // at least equal number of alphabetic chars
        // versus special and numerical
        if (min <= 2) {
            length = 4 + rand.nextInt(6);
        }
        else {
            length = min + rand.nextInt(16);
        }

        // Really disgusting while loop that continues until length
        // of password == length that we declared above
        while (pass.length() != length) {
            // Randomize choice between "abc..." "0-9" or special chars
            int curChar = rand.nextInt(3) + 1;
            // Ensures that the correct number of special chars
            // and numbers are printed before the password ends
            int charsRemaining = length - (num + specialChar);

            // If we generate a 1, choose a number to put in pass
            // assuming that we haven't already exceeded the number
            // of nums specified by the user
            if (curChar == 1 && counterNum != num) {
                pass.append(chars2.get(rand.nextInt(n.length())));
                counterNum++;
            }

            // If we generate a 2, choose a special char to put in pass
            // such that we haven't already exceeded the expected num
            // of special chars
            if (curChar == 2 && counterSpecial != specialChar) {
                pass.append(chars1.get(rand.nextInt(special.length())));
                counterSpecial++;
            }

            // If we get a 3, print an alphabetic character, assuming
            // that our pass string is not about to end without
            // having printed the necessary number of numbers and
            // special chars
            if (curChar == 3 && charsRemaining >= 0) {
                pass.append(chars.get(rand.nextInt(abc.length())));
            }
        }

        // Return completed password as a string
        return pass.toString();
    }
}
