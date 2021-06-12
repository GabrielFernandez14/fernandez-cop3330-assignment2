/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex36.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {
    public static final Scanner in = new Scanner(System.in);

    public static ArrayList<Integer> integers = new ArrayList<>();
    //public static ArrayList <String> strings = new ArrayList<>();

    public static void main(String[] args) {
        integers = populateList();

        System.out.print("Numbers: ");
        for (int i : integers) {
            System.out.print(i + " ");
        }
        System.out.println();

        CalculateStats ct = new CalculateStats();
        ct.printStats(integers);
    }

    public static ArrayList <Integer> populateList() {
        ArrayList<Integer> num = new ArrayList<>();
        int counter = 0;
        String s;
        //ArrayList <String> strings = new ArrayList<>();

        while(true) {
            System.out.print("Enter a number: ");
            s = in.nextLine();
            if (s.equals("done")) {
                break;
            }
            else {
                while (!isNum(s)) {
                    System.out.print("Enter a number: ");
                    s = in.nextLine();
                    //counter++;
                }
                int curNum = Integer.parseInt(s);

                num.add(counter, curNum);
                counter++;
            }
        }

        return num;
    }

    public static boolean isNum(String guess) {
        try {
            Integer.parseInt(guess);
        } catch (NumberFormatException e) {
            // The input is not an integer
            return false;
        }

        return true;
    }
}
