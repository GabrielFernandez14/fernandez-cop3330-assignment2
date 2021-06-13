/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex38.base;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    @Test
    void filterEvenNumbers_create_new_int_arr_by_using_arr_list_and_then_filter_even_numbers_set1() {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int [] expected = {2, 4, 6, 8};
        List<Integer> evenList = new ArrayList<>();

        for (int i : array) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        int size = evenList.size();
        int [] evenNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            evenNumbers[i] = evenList.get(i);
            assertEquals(expected[i], evenNumbers[i]);
        }
    }

    @Test
    void filterEvenNumbers_create_new_int_arr_by_using_arr_list_and_then_filter_even_numbers_set2() {
        int [] array = {134, 127, 369, 244, 235, 936, 187, 189};
        int [] expected = {134, 244, 936};
        List<Integer> evenList = new ArrayList<>();

        for (int i : array) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        int size = evenList.size();
        int [] evenNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            evenNumbers[i] = evenList.get(i);
            assertEquals(expected[i], evenNumbers[i]);
        }
    }

    @Test
    void filterEvenNumbers_create_new_int_arr_by_using_arr_list_and_then_filter_even_numbers_set3() {
        int [] array = {1000, 41, 673, 288, 468, 701, 84, 953};
        int [] expected = {1000, 288, 468, 84};
        List<Integer> evenList = new ArrayList<>();

        for (int i : array) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        int size = evenList.size();
        int [] evenNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            evenNumbers[i] = evenList.get(i);
            assertEquals(expected[i], evenNumbers[i]);
        }
    }

    @Test
    void filterEvenNumbers_create_new_int_arr_by_using_arr_list_and_then_filter_even_numbers_set4() {
        int [] array = {812, 1921, 123, 145, 9123, 2919, 2984, 1283, 294};
        int [] expected = {812, 2984, 294};
        List<Integer> evenList = new ArrayList<>();

        for (int i : array) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        int size = evenList.size();
        int [] evenNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            evenNumbers[i] = evenList.get(i);
            assertEquals(expected[i], evenNumbers[i]);
        }
    }

    @Test
    void filterEvenNumbers_create_new_int_arr_by_using_arr_list_and_then_filter_even_numbers_set5() {
        int [] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int [] expected = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        List<Integer> evenList = new ArrayList<>();

        for (int i : array) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        int size = evenList.size();
        int [] evenNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            evenNumbers[i] = evenList.get(i);
            assertEquals(expected[i], evenNumbers[i]);
        }
    }

    @Test
    void filterEvenNumbers_create_new_int_arr_by_using_arr_list_and_then_filter_even_numbers_set56() {
        int [] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int [] expected = {};
        List<Integer> evenList = new ArrayList<>();

        for (int i : array) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }

        int size = evenList.size();
        int [] evenNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            evenNumbers[i] = evenList.get(i);
            assertEquals(expected[i], evenNumbers[i]);
        }
    }
}