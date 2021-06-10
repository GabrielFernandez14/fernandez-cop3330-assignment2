/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex26.base;

import java.util.Scanner;
import java.lang.Math;

public class Solution26 {
    private static final Scanner in = new Scanner(System.in);

    private static double balance;
    private static double apr;
    private static double monthlyPay;

    public static void main(String[] args) {
        getInput();

        PaymentCalculator pc = new PaymentCalculator();
        double numMonths = pc.calculateMonthsUntilPaidOff(balance, apr, monthlyPay);

        //Math.ceil(numMonths);

        System.out.println("It will take you " + numMonths + " months to pay off this card.");
    }

    public static void getInput() {
        System.out.print("What is your balance? ");
        balance = in.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        monthlyPay = in.nextDouble();
    }
}
