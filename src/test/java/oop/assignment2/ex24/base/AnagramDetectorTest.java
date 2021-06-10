/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams_set1() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("note", "tone");

        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams_set2() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("difo", "fido");

        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams_set3() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("racecar", "carrace");

        // then
        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_uneven_word_lengths_set1() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("heaven", "hell");

        // then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_for_uneven_word_lengths_set2() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("supercallifragillisticexpialadocious", "hi");

        // then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_set1() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("heaven", "septum");

        // then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_set2() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("tune", "note");

        // then
        assertFalse(actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams_set3() {
        // given
        AnagramDetector detector = new AnagramDetector();

        // when
        boolean actual = detector.isAnagram("tie", "die");

        // then
        assertFalse(actual);
    }
}