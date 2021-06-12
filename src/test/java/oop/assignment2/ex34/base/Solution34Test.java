/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex34.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    // I tried making String [] employees a constant but it
    // really didn't like that so I ended up putting it inside
    // each and every test
    @Test
    void printEmployees_when_remove_is_valid_set1() {
        String [] employees = {"John Smith",
                "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                "Jeremy Goodwin"};
        String remove = "John Smith";

        for (int i = 0; i < 5; i++) {
            if (!employees[i].equals(remove)) {
                employees[i] = "true";
            }
            else {
                employees[i] = "false";
            }
        }

        assertEquals("false", employees[0]);
        assertEquals("true", employees[1]);
        assertEquals("true", employees[2]);
        assertEquals("true", employees[3]);
        assertEquals("true", employees[4]);
    }

    @Test
    void printEmployees_when_remove_is_valid_set2() {
        String [] employees = {"John Smith",
                "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                "Jeremy Goodwin"};
        String remove = "Jackie Jackson";

        for (int i = 0; i < 5; i++) {
            if (!employees[i].equals(remove)) {
                employees[i] = "true";
            }
            else {
                employees[i] = "false";
            }
        }

        assertEquals("true", employees[0]);
        assertEquals("false", employees[1]);
        assertEquals("true", employees[2]);
        assertEquals("true", employees[3]);
        assertEquals("true", employees[4]);
    }

    @Test
    void printEmployees_when_remove_is_valid_set3() {
        String [] employees = {"John Smith",
                "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                "Jeremy Goodwin"};
        String remove = "Chris Jones";

        for (int i = 0; i < 5; i++) {
            if (!employees[i].equals(remove)) {
                employees[i] = "true";
            }
            else {
                employees[i] = "false";
            }
        }

        assertEquals("true", employees[0]);
        assertEquals("true", employees[1]);
        assertEquals("false", employees[2]);
        assertEquals("true", employees[3]);
        assertEquals("true", employees[4]);
    }

    @Test
    void printEmployees_when_remove_is_valid_set4() {
        String [] employees = {"John Smith",
                "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                "Jeremy Goodwin"};
        String remove = "Amanda Cullen";

        for (int i = 0; i < 5; i++) {
            if (!employees[i].equals(remove)) {
                employees[i] = "true";
            }
            else {
                employees[i] = "false";
            }
        }

        assertEquals("true", employees[0]);
        assertEquals("true", employees[1]);
        assertEquals("true", employees[2]);
        assertEquals("false", employees[3]);
        assertEquals("true", employees[4]);
    }

    @Test
    void printEmployees_when_remove_is_valid_set5() {
        String [] employees = {"John Smith",
                "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                "Jeremy Goodwin"};
        String remove = "Jeremy Goodwin";

        for (int i = 0; i < 5; i++) {
            if (!employees[i].equals(remove)) {
                employees[i] = "true";
            }
            else {
                employees[i] = "false";
            }
        }

        assertEquals("true", employees[0]);
        assertEquals("true", employees[1]);
        assertEquals("true", employees[2]);
        assertEquals("true", employees[3]);
        assertEquals("false", employees[4]);
    }

    @Test
    void printEmployees_when_remove_is_not_valid_set1() {
        String [] employees = {"John Smith",
                "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                "Jeremy Goodwin"};
        String remove = "John Doe";

        for (int i = 0; i < 5; i++) {
            if (!employees[i].equals(remove)) {
                employees[i] = "true";
            }
            else {
                employees[i] = "false";
            }
        }

        assertEquals("true", employees[0]);
        assertEquals("true", employees[1]);
        assertEquals("true", employees[2]);
        assertEquals("true", employees[3]);
        assertEquals("true", employees[4]);
    }

    @Test
    void printEmployees_when_remove_is_not_valid_set2() {
        String [] employees = {"John Smith",
                "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                "Jeremy Goodwin"};
        String remove = "Professor Hollander";

        for (int i = 0; i < 5; i++) {
            if (!employees[i].equals(remove)) {
                employees[i] = "true";
            }
            else {
                employees[i] = "false";
            }
        }

        assertEquals("true", employees[0]);
        assertEquals("true", employees[1]);
        assertEquals("true", employees[2]);
        assertEquals("true", employees[3]);
        assertEquals("true", employees[4]);
    }

    @Test
    void printEmployees_when_remove_is_not_valid_set3() {
        String [] employees = {"John Smith",
                "Jackie Jackson", "Chris Jones", "Amanda Cullen",
                "Jeremy Goodwin"};
        String remove = "Difo God";

        for (int i = 0; i < 5; i++) {
            if (!employees[i].equals(remove)) {
                employees[i] = "true";
            }
            else {
                employees[i] = "false";
            }
        }

        assertEquals("true", employees[0]);
        assertEquals("true", employees[1]);
        assertEquals("true", employees[2]);
        assertEquals("true", employees[3]);
        assertEquals("true", employees[4]);
    }
}