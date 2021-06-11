/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex27.base;

public class ValidateIn {
    // Declare string constants (and regex constraints)
    public static final String numRegex = ".*[0-9].*";
    public static final String alphaRegex = ".*[a-zA-Z].*";
    public static final String noErrors = "There were no errors found.\n";
    public static final String error1 = "The first name must be at least 2 characters long.\n";
    public static final String error2 = "The first name must be filled in.\n";
    public static final String error3 = "The last name must be at least 2 characters long.\n";
    public static final String error4 = "The last name must be filled in.\n";
    public static final String error5 = "The zipcode must be a 5 digit number.\n";
    public static final String error6 = "The employee ID must be in the format AA-1234.\n";

    // validateInput function, doesn't actually do
    // the validating per say, but calls the functions
    // that do
    public String validateInput(String fName, String lName, String zip, String id) {
        String output = "";

        // Call validation functions, their error messages
        // are stored inside output
        output += validateFName(fName);
        output += validateLName(lName);
        output += validateZip(zip);
        output += validateID(id);

        if (output.equals("")) {
            return noErrors;
        }
        else {
            return output;
        }
    }

    // Check if fName is empty or less than 2 characters
    public static String validateFName(String fName) {
        if (fName.isEmpty()) {
            return error2;
        }
        if (fName.length() < 2) {
            return error1;
        }

        // Blank return, gives the function something
        // to return if neither if statement is entered
        return "";
    }

    // Repeat with lName
    public static String validateLName(String lName) {
        if (lName.isEmpty()) {
            return error4;
        }
        if (lName.length() < 2) {
            return error3;
        }

        return "";
    }

    // Because I'm weird, made it so that only this function
    // uses regex to evaluate, validateID could definitely be
    // improved if I knew how to use these properly
    public static String validateZip(String zip) {
        // Check if zip is a 5 digit number, if true, return ""
        if (zip.matches(numRegex) && !zip.matches(alphaRegex)
                && zip.length() == 5) {
            return "";
        }
        // zip is not a 5 digit number, return the appropriate error
        else {
            return error5;
        }
    }

    // This function is basically C code and hurts to
    // look at, I'm sorry
    public static String validateID(String id) {
        // If the length is not 7 characters, we already know
        // there is an error
        if (id.length() != 7) {
            return error6;
        }
        else {
            // Check each char individually to ensure it follows
            // the specified "AA-1234" format because I suck at coding
            boolean flag1 = Character.isLetter(id.charAt(0));
            boolean flag2 = Character.isLetter(id.charAt(1));
            int flag3 = Character.compare(id.charAt(2), '-');
            boolean flag4 = Character.isDigit(id.charAt(3));
            boolean flag5 = Character.isDigit(id.charAt(4));
            boolean flag6 = Character.isDigit(id.charAt(5));
            boolean flag7 = Character.isDigit(id.charAt(6));

            // Check if the ID follows the correct format, if true
            // return a blank string, if false, return an error message
            if (flag1 && flag2 && flag3 == 0 && flag4 && flag5 && flag6 && flag7) {
                return "";
            }
            else {
                return error6;
            }
        }
    }
}
