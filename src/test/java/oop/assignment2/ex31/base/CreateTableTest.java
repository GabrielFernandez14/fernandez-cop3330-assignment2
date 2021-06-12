/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex31.base;

import org.junit.jupiter.api.Test;
import java.lang.Math;
import static org.junit.jupiter.api.Assertions.*;

class CreateTableTest {
    @Test
    void calculateAndPrint_for_given_test_case_when_intensity_equals_55() {
        int age = 22;
        double intensity = 55, restingHR = 65;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(138, actual);
    }

    @Test
    void calculateAndPrint_for_given_test_case_when_intensity_equals_60() {
        int age = 22;
        double intensity = 60, restingHR = 65;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(145, actual);
    }

    @Test
    void calculateAndPrint_for_given_test_case_when_intensity_equals_65() {
        int age = 22;
        double intensity = 65, restingHR = 65;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(151, actual);
    }

    @Test
    void calculateAndPrint_for_given_test_case_when_intensity_equals_70() {
        int age = 22;
        double intensity = 70, restingHR = 65;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(158, actual);
    }

    @Test
    void calculateAndPrint_for_given_test_case_when_intensity_equals_75() {
        int age = 22;
        double intensity = 75, restingHR = 65;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(165, actual);
    }

    @Test
    void calculateAndPrint_for_given_test_case_when_intensity_equals_80() {
        int age = 22;
        double intensity = 80, restingHR = 65;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(171, actual);
    }

    @Test
    void calculateAndPrint_for_given_test_case_when_intensity_equals_85() {
        int age = 22;
        double intensity = 85, restingHR = 65;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(178, actual);
    }

    @Test
    void calculateAndPrint_for_given_test_case_when_intensity_equals_90() {
        int age = 22;
        double intensity = 90, restingHR = 65;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(185, actual);
    }

    @Test
    void calculateAndPrint_for_given_test_case_when_intensity_equals_95() {
        int age = 22;
        double intensity = 95, restingHR = 65;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(191, actual);
    }

    @Test
    void calculateAndPrint_for_alternate_test_case_when_intensity_equals_55() {
        int age = 32;
        double intensity = 55, restingHR = 58;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(130, actual);
    }

    @Test
    void calculateAndPrint_for_alternate_test_case_when_intensity_equals_60() {
        int age = 32;
        double intensity = 60, restingHR = 58;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(136, actual);
    }

    @Test
    void calculateAndPrint_for_alternate_test_case_when_intensity_equals_65() {
        int age = 32;
        double intensity = 65, restingHR = 58;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(143, actual);
    }

    @Test
    void calculateAndPrint_for_alternate_test_case_when_intensity_equals_70() {
        int age = 32;
        double intensity = 70, restingHR = 58;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(149, actual);
    }

    @Test
    void calculateAndPrint_for_alternate_test_case_when_intensity_equals_75() {
        int age = 32;
        double intensity = 75, restingHR = 58;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(156, actual);
    }

    @Test
    void calculateAndPrint_for_alternate_test_case_when_intensity_equals_80() {
        int age = 32;
        double intensity = 80, restingHR = 58;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(162, actual);
    }

    @Test
    void calculateAndPrint_for_alternate_test_case_when_intensity_equals_85() {
        int age = 32;
        double intensity = 85, restingHR = 58;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(169, actual);
    }

    @Test
    void calculateAndPrint_for_alternate_test_case_when_intensity_equals_90() {
        int age = 32;
        double intensity = 90, restingHR = 58;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(175, actual);
    }

    @Test
    void calculateAndPrint_for_alternate_test_case_when_intensity_equals_95() {
        int age = 32;
        double intensity = 95, restingHR = 58;

        double bpm = (((220 - age) - restingHR) * (intensity / 100)) + restingHR;

        int actual = (int) Math.round(bpm);

        assertEquals(182, actual);
    }

}