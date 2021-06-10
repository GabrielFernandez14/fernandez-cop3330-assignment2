/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex26.base;

import oop.assignment2.ex25.base.PassValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


// To test these I inputted the same exact calculation using the given equation
// into a calculator on google and compared the answers
class PaymentCalculatorTest {
    @Test
    void calculateMonthsUntilPaidOff_base_case_given_by_prompt() {
        // given
        PaymentCalculator calculator = new PaymentCalculator();

        // when
        double actual = calculator.calculateMonthsUntilPaidOff(5000, 12, 100);

        // then
        assertEquals(70.0, actual);
    }

    @Test
    void calculateMonthsUntilPaidOff_calculation_example_set_1() {
        // given
        PaymentCalculator calculator = new PaymentCalculator();

        // when
        double actual = calculator.calculateMonthsUntilPaidOff(10000, 17, 750);

        // then
        assertEquals(15.0, actual);
    }

    @Test
    void calculateMonthsUntilPaidOff_calculation_example_set_2() {
        // given
        PaymentCalculator calculator = new PaymentCalculator();

        // when
        double actual = calculator.calculateMonthsUntilPaidOff(1700, 20, 50);

        // then
        assertEquals(51.0, actual);
    }

    @Test
    void calculateMonthsUntilPaidOff_calculation_example_set_3() {
        // given
        PaymentCalculator calculator = new PaymentCalculator();

        // when
        double actual = calculator.calculateMonthsUntilPaidOff(50000, 7, 800);

        // then
        assertEquals(78.0, actual);
    }
}