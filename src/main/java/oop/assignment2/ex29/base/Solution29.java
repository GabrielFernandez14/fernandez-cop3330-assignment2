/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

// NOT FINISHED

package oop.assignment2.ex29.base;

import java.util.Scanner;
import java.lang.Math;

public class Solution29 {
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double years = getYears();

        int yearsInt = (int)Math.round(years);

        System.out.println("It will take " + yearsInt +
                " years to double your initial investment.");
    }

    public static double getYears() {
        int input;
        double total;

        while (true) {
            System.out.print("What is the rate of return? ");

            if (in.hasNextInt() && in.nextInt() != 0) {
                input = in.nextInt();
                total = 72.0 / input;
                break;
            }
            else {
                System.out.println("Sorry. That's not a valid input.");
            }
        }

        return total;
    }
}
