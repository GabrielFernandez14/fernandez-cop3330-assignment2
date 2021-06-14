/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex36.base;

// Import required statements
import java.util.ArrayList;
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution36 {
    // Declare scanner as a public constant
    public static final Scanner in = new Scanner(System.in);

    // Main function
    public static void main(String[] args) {
        // Declare ArrayList
        ArrayList<Integer> integers = new ArrayList<>();
        String output = "";

        // Populate the list while disallowing non integer
        // values from being entered into the array
        populateList(integers);

        // Print the user's input as a commented statement
        System.out.print("Numbers: ");
        for (int i = 0; i < integers.size(); i++) {
            if (i == integers.size() - 1) {
                System.out.print(integers.get(i));
            }
            else {
                System.out.print(integers.get(i) + ", ");
            }
        }
        System.out.println();

        // Store strings received from the functions
        // and concatenate inside output
        output += average(integers);
        output += min(integers);
        output += max(integers);
        output += std(integers);

        // Print output
        System.out.println(output);
    }

    // Take user input and store inside the array list
    public static void populateList(ArrayList<Integer> num) {
        String s;

        System.out.print("Enter a number: ");
        s = in.nextLine();

        // While user has not inputted "done"
        while(!s.equals("done")) {
            // Check that the user has inputted a number
            // if false, loop until they do
            while (!isNum(s)) {
                System.out.print("Enter a number: ");
                s = in.nextLine();
            }

            int curNum = Integer.parseInt(s);
            num.add(curNum);

            System.out.print("Enter a number: ");
            s = in.nextLine();
        }
    }

    // Calculate the average
    public static String average(ArrayList<Integer> values) {
        double sum = 0;

        for (int i : values) {
            sum += i;
        }

        return "The average is " + (sum / values.size()) + "\n";
    }

    // Find the minimum of the ArrayList
    public static String min(ArrayList<Integer> values) {
        int min = 987654321;

        for (int i : values) {
            if (i < min) {
                min = i;
            }
        }

        return "The minimum is " + min + "\n";
    }

    // Find the maximum of the ArrayList
    public static String max(ArrayList<Integer> values) {
        int max = -987654321;

        for (int i : values) {
            if (i > max) {
                max = i;
            }
        }

        return "The maximum is " + max + "\n";
    }

    // Find the standard deviation of the ArrayList
    public static String std(ArrayList<Integer> values) {
        double sum = 0.0, std = 0.0;
        int length = values.size();

        for (double i : values) {
            sum += i;
        }

        double avg = sum / length;

        for (double num: values) {
            std += Math.pow(num - avg, 2);
        }

        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        return "The standard deviation is " + df.format(Math.sqrt(std / length));
    }

    // Validate that the inputted string is an integer value
    public static boolean isNum(String guess) {
        try {
            Integer.parseInt(guess);
        } catch (NumberFormatException e) {
            // The input is not an integer
            return false;
        }

        return true;
    }
}
