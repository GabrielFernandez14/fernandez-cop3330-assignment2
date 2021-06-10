/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex26.base;

import java.lang.Math;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff (double balance, double apr, double monthlyPay) {
        double dailyRate = apr / 365;

        return -(1 / 30.0) * (Math.log(1 + balance) / monthlyPay * (1 - Math.pow(1 + dailyRate, 30)) / Math.log(1 + dailyRate));
    }
}
