package oop.assignment2.ex29.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    public static boolean isNum(String input) {
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    @Test
    void getYears_loop_until_user_enters_a_number_that_is_not_0_then_calculate_set1() {
        // given (as an array since I don't know how testing
        // loops in junit works
        String [] input = {"0", "ABC", "4", "XYZ"};
        int counter = 0;

        // Since
        while (!isNum(input[counter]) || input[counter].equals("0")) {
            counter++;
        }

        // calculate when input is 4
        double num = Double.parseDouble(input[counter]);
        int actual = (int) Math.round(72.0 / num);

        assertEquals(18, actual);
    }

    @Test
    void getYears_loop_until_user_enters_a_number_that_is_not_0_then_calculate_set2() {
        // given (as an array since I don't know how testing
        // loops in junit works
        String [] input = {"ajsdbaj", "20", "0", "71aAB", "0", "ABXZ"};
        int counter = 0;

        // Since
        while (!isNum(input[counter]) || input[counter].equals("0")) {
            counter++;
        }

        // calculate when input is 20
        double num = Double.parseDouble(input[counter]);
        int actual = (int) Math.round(72.0 / num);

        assertEquals(4, actual);
    }

    @Test
    void getYears_loop_until_user_enters_a_number_that_is_not_0_then_calculate_set3() {
        // given (as an array since I don't know how testing
        // loops in junit works
        String [] input = {"asjdfas", "cry baby cry", "0", "Here's my SSN:", "2282-123", "17"};
        int counter = 0;

        // Exit loop once input[counter] is a number
        while (!isNum(input[counter]) || input[counter].equals("0")) {
            counter++;
        }

        // calculate when input is 17
        double num = Double.parseDouble(input[counter]);
        int actual = (int) Math.round(72.0 / num);

        assertEquals(4, actual);
    }
}