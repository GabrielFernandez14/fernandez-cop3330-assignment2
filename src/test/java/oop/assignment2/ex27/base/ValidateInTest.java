/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex27.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidateInTest {
    public static final String noErrors = "There were no errors found.\n";
    public static final String error1 = "The first name must be at least 2 characters long.\n";
    public static final String error2 = "The first name must be filled in.\n";
    public static final String error3 = "The last name must be at least 2 characters long.\n";
    public static final String error4 = "The last name must be filled in.\n";
    public static final String error5 = "The zipcode must be a 5 digit number.\n";
    public static final String error6 = "The employee ID must be in the format AA-1234.\n";

    @Test
    void validateInput_when_all_tests_return_an_errors_set1() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("J", "D", "123456", "ABC-1234");

        // then
        assertEquals(error1 + error3 + error5 + error6, actual);
    }

    @Test
    void validateInput_when_all_tests_return_an_errors_set2() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("", "", "ABCDE", "AB%1234");

        // then
        assertEquals(error2 + error4 + error5 + error6, actual);
    }

    @Test
    void validateInput_when_only_fName_returns_an_error_set1() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("J", "Scott", "12345", "AB-1234");

        // then
        assertEquals(error1, actual);
    }

    @Test
    void validateInput_when_only_fName_returns_an_error_set2() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("", "Pilgrim", "23467", "JT-1982");

        // then
        assertEquals(error2, actual);
    }

    @Test
    void validateInput_when_only_lName_returns_an_error_set1() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("Gabriel", "P", "67129", "IA-1283");

        // then
        assertEquals(error3, actual);
    }

    @Test
    void validateInput_when_only_lName_returns_an_error_set2() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("Tyler", "", "12837", "IZ-8780");

        // then
        assertEquals(error4, actual);
    }

    @Test
    void validateInput_when_only_zip_returns_an_error_set1() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("Jonah", "Scott", "ABCDE", "TY-1202");

        // then
        assertEquals(error5, actual);
    }

    @Test
    void validateInput_when_only_zip_returns_an_error_set2() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("James", "Charles", "123456", "GU-1712");

        // then
        assertEquals(error5, actual);
    }

    @Test
    void validateInput_when_only_zip_returns_an_error_set3() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("Seth", "Zimmerman", "1234A", "CY-8192");

        // then
        assertEquals(error5, actual);
    }

    @Test
    void validateInput_when_only_ID_returns_an_error_set1() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("John", "Doe", "32816", "C1-8192");

        // then
        assertEquals(error6, actual);
    }

    @Test
    void validateInput_when_only_ID_returns_an_error_set2() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("John", "Doe", "32816", "C1&8192");

        // then
        assertEquals(error6, actual);
    }

    @Test
    void validateInput_when_only_ID_returns_an_error_set3() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("John", "Doe", "32816", "C1-A1B2");

        // then
        assertEquals(error6, actual);
    }

    @Test
    void validateInput_when_no_errors_are_returned() {
        // given
        ValidateIn validate = new ValidateIn();

        // when
        String actual = validate.validateInput("John", "Doe", "32816", "CA-8192");

        // then
        assertEquals(noErrors, actual);
    }
}