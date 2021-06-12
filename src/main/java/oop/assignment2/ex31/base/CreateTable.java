/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex31.base;

// Import math libraries
import java.lang.Math;

public class CreateTable {
    // It does exactly what the name implies :)
    public void calculateAndPrint(double restingHR, int age) {
        // Initialize bpm
        double bpm;

        // Initial prints
        System.out.println("Intensity\t| Rate");
        System.out.println("---------------------");

        // Begin at 55 and increment by 5 each iteration
        for (double i = 55; i <= 95; i += 5) {
            // Calculate the bpm
            bpm = (((220 - age) - restingHR) * (i / 100)) + restingHR;
            // Format via \t and round all bpm values
            // to the nearest whole number
            System.out.println(Math.round(i) + "%\t\t\t| "
                                + Math.round(bpm) + " bpm");
        }
    }
}
