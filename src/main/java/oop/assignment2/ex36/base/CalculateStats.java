/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex36.base;

import java.util.ArrayList;
import java.lang.Math;

public class CalculateStats {
    public static ArrayList<Integer> values = new ArrayList<>();

    public void printStats(ArrayList<Integer> integers) {
        values = integers;

        String output = "";

        output += average(values);
        output += min(values);
        output += max(values);
        output += std(values);

        System.out.println(output);
    }

    public String average(ArrayList<Integer> values) {
        double sum = 0;

        for (int i : values) {
            sum += values.get(i);
        }

        return "The average is " + (sum / values.size()) + "\n";
    }

    public String min(ArrayList<Integer> values) {
        int min = 987654321;

        for (int i : values) {
            if (values.get(i) < min) {
                min = values.get(i);
            }
        }

        return "The minimum is " + min + "\n";
    }

    public String max(ArrayList<Integer> values) {
        int max = -987654321;

        for (int i : values) {
            if (values.get(i) > max) {
                max = values.get(i);
            }
        }

        return "The minimum is " + max + "\n";
    }

    public String std(ArrayList<Integer> values) {
        double sum = 0.0, std = 0.0;
        int length = values.size();

        for (int i : values) {
            sum += values.get(i);
        }

        double avg = sum / length;

        for (double num: values) {
            std += Math.pow(num - avg, 2);
        }

        return "The standard deviation is " + (std / length);
    }
}
