/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex25.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassValidatorTest {

    @Test
    void passwordValidator_pass_is_only_numbers_and_is_less_than_8() {
        // given
        PassValidator validator = new PassValidator();

        // when
        int actual = validator.passwordValidator("1234567");

        // then
        assertEquals(1, actual);
    }

    @Test
    void passwordValidator_pass_is_only_numbers_and_is_greater_than_8() {
        // given
        PassValidator validator = new PassValidator();

        // when
        int actual = validator.passwordValidator("123456789");

        // then
        assertEquals(2, actual);
    }

    @Test
    void passwordValidator_pass_is_only_alphabetical_and_is_less_than_8() {
        // given
        PassValidator validator = new PassValidator();

        // when
        int actual = validator.passwordValidator("hello");

        // then
        assertEquals(3, actual);
    }

    @Test
    void passwordValidator_pass_is_only_alphabetical_and_is_greater_than_8() {
        // given
        PassValidator validator = new PassValidator();

        // when
        int actual = validator.passwordValidator("hellomynameisdifo");

        // then
        assertEquals(4, actual);
    }

    @Test
    void passwordValidator_pass_is_both_numbers_and_letters_and_has_no_special_chars_and_is_greater_than_8() {
        // given
        PassValidator validator = new PassValidator();

        // when
        int actual = validator.passwordValidator("halloIliketurtles41");

        // then
        assertEquals(5, actual);
    }

    @Test
    void passwordValidator_pass_is_both_numbers_and_letters_and_has_no_special_chars_and_is_less_than_8() {
        // given
        PassValidator validator = new PassValidator();

        // when
        int actual = validator.passwordValidator("hallo41");

        // then
        assertEquals(6, actual);
    }

    @Test
    void passwordValidator_pass_has_numbers_letters_and_special_chars_and_is_greater_than_8() {
        // given
        PassValidator validator = new PassValidator();

        // when
        int actual = validator.passwordValidator("78&!abc63*");

        // then
        assertEquals(7, actual);
    }

    @Test
    void passwordValidator_pass_has_numbers_letters_and_special_chars_and_is_less_than_8() {
        // given
        PassValidator validator = new PassValidator();

        // when
        int actual = validator.passwordValidator("78&!ab");

        // then
        assertEquals(8, actual);
    }

    // I'd test option 9, but I'm too lazy to figure out how to put non-english characters
    // in here, basically unless you're being weird, option 9 should not be possible
}