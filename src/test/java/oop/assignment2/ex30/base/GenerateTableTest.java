/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex30.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateTableTest {
    // Declare each row of a correct 12x12 multiplication table
    public int[] row1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    public int[] row2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
    public int[] row3 = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};
    public int[] row4 = {4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44, 48};
    public int[] row5 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60};
    public int[] row6 = {6, 12, 18, 24, 30, 36, 42, 48, 54, 60, 66, 72};
    public int[] row7 = {7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84};
    public int[] row8 = {8, 16, 24, 32, 40, 48, 56, 64, 72, 80, 88, 96};
    public int[] row9 = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90, 99, 108};
    public int[] row10 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
    public int[] row11 = {11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132};
    public int[] row12 = {12, 24, 36, 48, 60, 72, 84, 96, 108, 120, 132, 144};

    @Test
    void generateMultiplicationTable_check_if_created_table_is_equal_to_correct_table() {
        // Initialize table
        int [][] table = new int[12][12];

        // Generate table
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // Check that each row is the same as it would be
        // in a correct multiplication table
        assertArrayEquals(row1, table[0]);
        assertArrayEquals(row2, table[1]);
        assertArrayEquals(row3, table[2]);
        assertArrayEquals(row4, table[3]);
        assertArrayEquals(row5, table[4]);
        assertArrayEquals(row6, table[5]);
        assertArrayEquals(row7, table[6]);
        assertArrayEquals(row8, table[7]);
        assertArrayEquals(row9, table[8]);
        assertArrayEquals(row10, table[9]);
        assertArrayEquals(row11, table[10]);
        assertArrayEquals(row12, table[11]);
    }
}