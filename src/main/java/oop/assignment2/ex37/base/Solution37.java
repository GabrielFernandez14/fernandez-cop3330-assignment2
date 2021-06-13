/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex37.base;

// Import scanner
import java.util.Scanner;

public class Solution37 {
    // Declare scanner operator as a public constant
    public static final Scanner in = new Scanner(System.in);

    // One function main statements are in style right now
    public static void main(String[] args) {
        getPass();
    }

    // Prompt user for input and store
    public static void getPass() {
        System.out.print("What's the minimum length? ");
        int min = in.nextInt();

        System.out.print("How many special characters? ");
        int specialChar = in.nextInt();

        System.out.print("How many numbers? ");
        int num = in.nextInt();

        // Create a new instance of GeneratePassword
        // and store it's return string inside of password
        GeneratePassword gp = new GeneratePassword();
        String password = gp.randomPassGenerator(min, specialChar, num);

        // Print exit statement
        System.out.println("Your password is " + password);
    }
}
