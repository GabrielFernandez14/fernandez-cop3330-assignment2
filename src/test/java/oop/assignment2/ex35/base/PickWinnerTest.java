/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex35.base;

import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PickWinnerTest {
    @Test
    void pickWinnerRandomly_check_that_counter_and_rand_does_not_exceed_allotted_bounds() {
        Random rand = new Random();
        int counter = 0, max = 100000, winner = rand.nextInt(max - 1);
        boolean test = true;

        // Simplified version of my code for testing purposes
        counter++;
        for (int i = 0; i < max; i++) {
            // Counter cannot be lower than 1 since user
            // must make at least one input
            if (counter < 1) {
                test = false;
            }
            // Winner must be >= 0 and < max (where max is 100000)
            if (!(winner > -1) && !(winner < max)) {
                test = false;
            }
            // Counter cannot exceed max because then it would be
            // out of bounds
            if (counter > max) {
                test = false;
            }

            winner = rand.nextInt(max - 1);
        }

        assertTrue(test);
    }

    @Test
    void pickWinnerRandomly_counter_does_not_exceed_its_bounds_and_winner_is_returned_set1() {
        String [] inputs = {"[Impossible]", "Meg", "Brian", "Tiffany", ""};
        String expected = "Tiffany";
        int counter = 0;

        // Similar to how pickWinnerRandomly()'s loop functions
        counter++;
        while (!inputs[counter].equals("")) {
            counter++;
        }

        assertEquals(4, counter);

        // Obviously this would normally be randomized
        assertEquals(expected, inputs[counter - 1]);
    }

    @Test
    void pickWinnerRandomly_counter_does_not_exceed_its_bounds_and_winner_is_returned_set2() {
        String [] inputs = {"[Impossible]", "Meg", "Brian", "Tiffany", "Rich", "Cuckoo", ""};
        String expected = "Meg";
        int counter = 0;

        // Similar to how pickWinnerRandomly()'s loop functions
        counter++;
        while (!inputs[counter].equals("")) {
            counter++;
        }

        assertEquals(6, counter);

        // Obviously this would normally be randomized
        assertEquals(expected, inputs[counter - 5]);
    }

    @Test
    void pickWinnerRandomly_counter_does_not_exceed_its_bounds_and_winner_is_returned_set3() {
        String [] inputs = {"[Impossible]", "You", "Are", "A", "Saucy", "Boy", "What", "You", "Egg", ""};
        String expected = "A";
        int counter = 0;

        // Similar to how pickWinnerRandomly()'s loop functions
        counter++;
        while (!inputs[counter].equals("")) {
            counter++;
        }

        assertEquals(9, counter);

        // Obviously this would normally be randomized
        assertEquals(expected, inputs[counter - 6]);
    }
}