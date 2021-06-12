/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex30.base;

public class GenerateTable {
    // Generates a multiplication table using a 2D array
    // and nested for loops
    public void generateMultiplicationTable() {
        int i, j;
        int [][] table = new int[12][12];

        // Traverses the columns
        for (i = 0; i < 12; i++) {
            // Traverses the rows
            for (j = 0; j < 12; j++) {
                // Assign the value of table[i][j] to be the product
                // of i and j (+1 is because array's indices start at 0
                table[i][j] = (i + 1) * (j + 1);
                // Print using printf to format it right-aligned
                System.out.printf("%5d", table[i][j]);
            }
            // Print a new line at the end of each column
            System.out.println();
        }
    }
}
