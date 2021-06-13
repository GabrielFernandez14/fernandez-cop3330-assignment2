/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex37.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GeneratePasswordTest {
    // World's longest test function name?
    @Test
    void randomPassGenerator_test_to_see_if_length_is_greater_than_min_and_if_num_and_specialChar_are_equivalent_and_if_alphabet_is_equal_or_greater_than_num_nums_and_specialChars_set1() {
        GeneratePassword generate = new GeneratePassword();
        int min = 8, num = 2, specialChar = 2;
        int alphaCounter = 0, specialCounter = 0, numCounter = 0;

        // Parameters are swapped in my original function too, so this is correct
        String password = generate.randomPassGenerator(min, specialChar, num);
        boolean minTest = true;
        boolean alphaIsDouble = true;

        if (password.length() <= min) {
            minTest = false;
        }

        char [] arrPass = password.toCharArray();

        for (int i = 0; i < password.length(); i++) {
            if (Character.isAlphabetic(arrPass[i])) {
                alphaCounter++;
            }
            if (Character.isDigit(arrPass[i])) {
                numCounter++;
            }
            if(!Character.isLetterOrDigit(arrPass[i])) {
                specialCounter++;
            }
        }

        if (alphaCounter < (num + specialChar)) {
            alphaIsDouble = false;
        }

        assertTrue(minTest);
        assertTrue(alphaIsDouble);
        assertEquals(num, numCounter);
        assertEquals(specialChar, specialCounter);
    }

    @Test
    void randomPassGenerator_test_to_see_if_length_is_greater_than_min_and_if_num_and_specialChar_are_equivalent_and_if_alphabet_is_equal_or_greater_than_num_nums_and_specialChars_set2() {
        GeneratePassword generate = new GeneratePassword();
        int min = 4, num = 2, specialChar = 2;
        int alphaCounter = 0, specialCounter = 0, numCounter = 0;

        String password = generate.randomPassGenerator(min, specialChar, num);
        boolean minTest = true;
        boolean alphaIsDouble = true;

        if (password.length() <= min) {
            minTest = false;
        }

        char [] arrPass = password.toCharArray();

        for (int i = 0; i < password.length(); i++) {
            if (Character.isAlphabetic(arrPass[i])) {
                alphaCounter++;
            }
            if (Character.isDigit(arrPass[i])) {
                numCounter++;
            }
            if(!Character.isLetterOrDigit(arrPass[i])) {
                specialCounter++;
            }
        }

        if (alphaCounter < (num + specialChar)) {
            alphaIsDouble = false;
        }

        assertTrue(minTest);
        assertTrue(alphaIsDouble);
        assertEquals(num, numCounter);
        assertEquals(specialChar, specialCounter);
    }

    @Test
    void randomPassGenerator_test_to_see_if_length_is_greater_than_min_and_if_num_and_specialChar_are_equivalent_and_if_alphabet_is_equal_or_greater_than_num_nums_and_specialChars_set3() {
        GeneratePassword generate = new GeneratePassword();
        int min = 10, num = 2, specialChar = 2;
        int alphaCounter = 0, specialCounter = 0, numCounter = 0;

        String password = generate.randomPassGenerator(min, specialChar, num);
        boolean minTest = true;
        boolean alphaIsDouble = true;

        if (password.length() <= min) {
            minTest = false;
        }

        char [] arrPass = password.toCharArray();

        for (int i = 0; i < password.length(); i++) {
            if (Character.isAlphabetic(arrPass[i])) {
                alphaCounter++;
            }
            if (Character.isDigit(arrPass[i])) {
                numCounter++;
            }
            if(!Character.isLetterOrDigit(arrPass[i])) {
                specialCounter++;
            }
        }

        if (alphaCounter < (num + specialChar)) {
            alphaIsDouble = false;
        }

        assertTrue(minTest);
        assertTrue(alphaIsDouble);
        assertEquals(num, numCounter);
        assertEquals(specialChar, specialCounter);
    }

    @Test
    void randomPassGenerator_test_to_see_if_length_is_greater_than_min_and_if_num_and_specialChar_are_equivalent_and_if_alphabet_is_equal_or_greater_than_num_nums_and_specialChars_set4() {
        GeneratePassword generate = new GeneratePassword();
        int min = 100, num = 0, specialChar = 1;
        int alphaCounter = 0, specialCounter = 0, numCounter = 0;

        String password = generate.randomPassGenerator(min, specialChar, num);
        boolean minTest = true;
        boolean alphaIsDouble = true;

        if (password.length() <= min) {
            minTest = false;
        }

        char [] arrPass = password.toCharArray();

        for (int i = 0; i < password.length(); i++) {
            if (Character.isAlphabetic(arrPass[i])) {
                alphaCounter++;
            }
            if (Character.isDigit(arrPass[i])) {
                numCounter++;
            }
            if(!Character.isLetterOrDigit(arrPass[i])) {
                specialCounter++;
            }
        }

        if (alphaCounter < (num + specialChar)) {
            alphaIsDouble = false;
        }

        assertTrue(minTest);
        assertTrue(alphaIsDouble);
        assertEquals(num, numCounter);
        assertEquals(specialChar, specialCounter);
    }

    @Test
    void randomPassGenerator_test_to_see_if_length_is_greater_than_min_and_if_num_and_specialChar_are_equivalent_and_if_alphabet_is_equal_or_greater_than_num_nums_and_specialChars_set5() {
        GeneratePassword generate = new GeneratePassword();
        int min = 11, num = 5, specialChar = 0;
        int alphaCounter = 0, specialCounter = 0, numCounter = 0;

        String password = generate.randomPassGenerator(min, specialChar, num);
        boolean minTest = true;
        boolean alphaIsDouble = true;

        if (password.length() <= min) {
            minTest = false;
        }

        char [] arrPass = password.toCharArray();

        for (int i = 0; i < password.length(); i++) {
            if (Character.isAlphabetic(arrPass[i])) {
                alphaCounter++;
            }
            if (Character.isDigit(arrPass[i])) {
                numCounter++;
            }
            if(!Character.isLetterOrDigit(arrPass[i])) {
                specialCounter++;
            }
        }

        if (alphaCounter < (num + specialChar)) {
            alphaIsDouble = false;
        }

        assertTrue(minTest);
        assertTrue(alphaIsDouble);
        assertEquals(num, numCounter);
        assertEquals(specialChar, specialCounter);
    }
}