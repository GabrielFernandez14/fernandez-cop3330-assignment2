/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex32.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayGameTest {
    public static final String NaN = "Not a number.";
    public static final String higher = "Higher.";
    public static final String lower = "Lower.";
    public static final String correct = "Correct.";

    public static boolean isNum(String guess) {
        try {
            Integer.parseInt(guess);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public String getResponse (String guess, int target) {
        if (isNum(guess)) {
            int num = Integer.parseInt(guess);

            if (num > target) {
                return lower;
            }
            else if (num < target) {
                return higher;
            }
            else {
                return correct;
            }
        }

        else {
            return NaN;
        }
    }

    // These tests are basically a very broken down version of
    // the way my actual program handles inputs
    @Test
    void playGuessingGame_difficulty_is_1_and_user_guesses_wrong_before_guessing_right_set1() {
        // playGuessingGame is a void function, so use
        // strings to mimic it's outputs
        int target = 5;
        int guessCounter = 0;

        assertEquals(lower, getResponse("6", target));
        guessCounter++;
        assertEquals(higher, getResponse("3", target));
        guessCounter++;
        assertEquals(lower, getResponse("9", target));
        guessCounter++;
        assertEquals(NaN, getResponse("abc", target));
        guessCounter++;
        assertEquals(correct, getResponse("5", target));
        assertEquals(4, guessCounter);
    }

    @Test
    void playGuessingGame_difficulty_is_1_and_user_guesses_wrong_before_guessing_right_set2() {
        // playGuessingGame is a void function, so use
        // strings to mimic it's outputs
        int target = 34;
        int guessCounter = 0;

        assertEquals(higher, getResponse("7", target));
        guessCounter++;
        assertEquals(higher, getResponse("21", target));
        guessCounter++;
        assertEquals(NaN, getResponse("Hallo", target));
        guessCounter++;
        assertEquals(NaN, getResponse("Stop inputting words you weirdo", target));
        guessCounter++;
        assertEquals(lower, getResponse("55", target));
        guessCounter++;
        assertEquals(lower, getResponse("35", target));
        guessCounter++;
        assertEquals(correct, getResponse("34", target));
        assertEquals(6, guessCounter);
    }

    @Test
    void playGuessingGame_difficulty_is_1_and_user_guesses_wrong_before_guessing_right_set3() {
        // playGuessingGame is a void function, so use
        // strings to mimic it's outputs
        int target = 712;
        int guessCounter = 0;

        assertEquals(higher, getResponse("71", target));
        guessCounter++;
        assertEquals(higher, getResponse("234", target));
        guessCounter++;
        assertEquals(NaN, getResponse("wadduhecc", target));
        guessCounter++;
        assertEquals(higher, getResponse("490", target));
        guessCounter++;
        assertEquals(lower, getResponse("981", target));
        guessCounter++;
        assertEquals(lower, getResponse("743", target));
        guessCounter++;
        assertEquals(NaN, getResponse("silly baka", target));
        guessCounter++;
        assertEquals(lower, getResponse("724", target));
        guessCounter++;
        assertEquals(higher, getResponse("707", target));
        guessCounter++;
        assertEquals(correct, getResponse("712", target));
        guessCounter++;
        assertEquals(10, guessCounter);
    }
}