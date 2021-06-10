/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex26.base;

// Import lang.Math
import java.lang.Math;

public class PaymentCalculator {
    // calculateMonthsUntilPaidOff calculates the months until the user pays off
    // their card
    public double calculateMonthsUntilPaidOff (double b, double apr, double p) {
        // Calculate the daily rate by first converting apr to a decimal
        // then dividing by 365
        double i = (apr / 100) / 365;

        // Enclose equation in Math.ceil() to round up to nearest integer
        return Math.ceil(-(1 / 30.0) * (Math.log(1 + b / p *
                (1 - (Math.pow((1 + i), 30)))) / Math.log(1 + i)));
    }
}

