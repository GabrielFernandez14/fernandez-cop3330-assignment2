package oop.assignment2.ex28.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    // These tests are basically the same as main
    // the only difference being is that the inputs
    // are stored in an array instead of being
    // inputted by the user
    @Test
    void getSum_find_the_sum_by_looping_5_times_and_adding_each_iteration_inside_total_set1() {
        // given
        int [] sum = {1, 2, 3, 4, 5};
        int total = 0;

        // loop to calculate
        for (int i = 0; i < 5; i++) {
            total += sum[i];
        }

        // then
        assertEquals(15, total);
    }

    @Test
    void getSum_find_the_sum_by_looping_5_times_and_adding_each_iteration_inside_total_set2() {
        // given
        int [] sum = {6, 7, 13, 45, 1};
        int total = 0;

        // loop to calculate
        for (int i = 0; i < 5; i++) {
            total += sum[i];
        }

        // then
        assertEquals(72, total);
    }

    @Test
    void getSum_find_the_sum_by_looping_5_times_and_adding_each_iteration_inside_total_set3() {
        // given
        int [] sum = {74, 123, 81, 19, 3};
        int total = 0;

        // loop to calculate
        for (int i = 0; i < 5; i++) {
            total += sum[i];
        }

        // then
        assertEquals(300, total);
    }
}