/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex25.base;

// Import regex matcher and pattern libraries
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassValidator {
    // passwordValidator function
    public int passwordValidator(String pass) {
        // Declare bounds set by regex and assign
        // to their respective variables
        String numRegex = ".*[0-9].*";
        String alphaRegex = ".*[a-zA-Z].*";

        // Declare bounds set by regex and assign
        // to the boolean, this checks if there are any
        // special chars by checking for the lack of chars
        // that are within the bounds a-z, A-Z, and 0-9
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(pass);
        boolean areSpecialChars = matcher.find();

        // Check if password has only numbers, and is < 8
        if (pass.matches(numRegex) && !pass.matches(alphaRegex)
                && pass.length() < 8) {
            // Return a specified number to indicate this statement's validity
            return 1;
        }
        // Check if only number password being >= 8 characters
        else if (pass.matches(numRegex) && !pass.matches(alphaRegex)
                && pass.length() >= 8) {
            return 2;
        }
        // This means the password may not only be numbers
        else {
            // Check if the password is only alphabet letters and is
            // < 8 in length
            if (pass.matches(alphaRegex) && !pass.matches(numRegex)
                    && pass.length() < 8) {
                return 3;
            }
            // Check if the password is only alphabet letters and is
            // >= 8 in length
            else if (pass.matches(alphaRegex) && !pass.matches(numRegex)
                    && pass.length() >= 8) {
                return 4;
            }
            // This means the password may have both alphabetical and numerical
            // characters
            else {
                // Check for the lack of special characters and a length of >= 8
                if (pass.matches(numRegex) && pass.matches(alphaRegex)
                        && !areSpecialChars && pass.length() >= 8) {
                    return 5;
                }
                // Check for the lack of special characters and a length of < 8
                else if (pass.matches(numRegex) && pass.matches(alphaRegex)
                        && !areSpecialChars && pass.length() < 8) {
                    return 6;
                }
                // This means the password has alphabetical, numerical, and special characters
                else {
                    // Check if the length is >= 8
                    if (pass.matches(numRegex) && pass.matches(alphaRegex)
                            && areSpecialChars && pass.length() >= 8) {
                        return 7;
                    }
                    // Check if the length is < 8
                    else if (pass.matches(numRegex) && pass.matches(alphaRegex)
                            && areSpecialChars && pass.length() < 8) {
                        return 8;
                    }
                    // This is not possible unless you have a keyboard in another language
                    else {
                        return 9;
                    }
                }
            }
        }
    }
}