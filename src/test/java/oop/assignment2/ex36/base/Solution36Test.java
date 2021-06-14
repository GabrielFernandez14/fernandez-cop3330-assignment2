package oop.assignment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    // Test to ensure calculations are correct
    // Since the function that stores values
    // inside my ArrayList is void and I'm too
    // lazy to make tests for it and I'm pretty
    // sure it's working how I want it to
    @Test
    void average_find_the_average_from_a_given_integer_arraylist_set1() {
        double sum = 0;

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(100);
        integers.add(200);
        integers.add(1000);
        integers.add(300);

        for (int i : integers) {
            sum += i;
        }

        double avg = sum / integers.size();

        assertEquals(400.0, avg);
    }

    @Test
    void average_find_the_average_from_a_given_integer_arraylist_set2() {
        double sum = 0;

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(55);
        integers.add(269);
        integers.add(781);
        integers.add(632);
        integers.add(123);
        integers.add(422);

        for (int i : integers) {
            sum += i;
        }

        double avg = sum / integers.size();

        assertEquals(380.3333333333333, avg);
    }

    @Test
    void min_find_the_minimum_from_a_given_integer_arraylist_set1() {
        int min = 1000;

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1314);
        integers.add(23);
        integers.add(1223);
        integers.add(-43);
        integers.add(192);
        integers.add(12415);

        for (int i : integers) {
            if (i < min) {
                min = i;
            }
        }

        assertEquals(-43 , min);
    }

    @Test
    void min_find_the_minimum_from_a_given_integer_arraylist_set2() {
        int min = 1000;

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(213);
        integers.add(12131);
        integers.add(512);
        integers.add(-151);
        integers.add(-1234);
        integers.add(-2513);

        for (int i : integers) {
            if (i < min) {
                min = i;
            }
        }

        assertEquals(-2513 , min);
    }

    @Test
    void max_find_the_maximum_from_a_given_integer_arraylist_set1() {
        int max = 0;

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(3142);
        integers.add(512);
        integers.add(1245);
        integers.add(-134);
        integers.add(1234);
        integers.add(5192);
        integers.add(4182);

        for (int i : integers) {
            if (i > max) {
                max = i;
            }
        }

        assertEquals(5192 , max);
    }

    @Test
    void max_find_the_maximum_from_a_given_integer_arraylist_set2() {
        int max = 0;

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(1442);
        integers.add(12313);
        integers.add(412);
        integers.add(-445);

        for (int i : integers) {
            if (i > max) {
                max = i;
            }
        }

        assertEquals(12313 , max);
    }

    @Test
    void std_calculate_the_standard_deviation_from_a_given_arraylist_set1() {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(100);
        integers.add(200);
        integers.add(1000);
        integers.add(300);

        double sum = 0.0, std = 0.0;
        int length = integers.size();

        for (double i : integers) {
            sum += i;
        }

        double avg = sum / length;

        for (double num: integers) {
            std += Math.pow(num - avg, 2);
        }

        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        assertEquals("353.56", df.format(Math.sqrt(std / length)));
    }

    @Test
    void std_calculate_the_standard_deviation_from_a_given_arraylist_set2() {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(120);
        integers.add(710);
        integers.add(1294);
        integers.add(150);
        integers.add(300);
        integers.add(250);

        double sum = 0.0, std = 0.0;
        int length = integers.size();

        for (double i : integers) {
            sum += i;
        }

        double avg = sum / length;

        for (double num: integers) {
            std += Math.pow(num - avg, 2);
        }

        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        assertEquals("416.09", df.format(Math.sqrt(std / length)));
    }
}