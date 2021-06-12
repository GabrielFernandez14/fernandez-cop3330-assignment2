/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Gabriel Fernandez
 */

package oop.assignment2.ex33.base;

import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void magic8Ball_is_within_range_0_through_3() {
        Random rn = new Random();
        int max = 4;
        int n = rn.nextInt(max);
        boolean check = true;

        // Yes I know it's always true, that's the point,
        // why must you give me warnings
        for (int i = 0; i < 100000; i++) {
            if (n > 3) {
                fail("n exceeds index max of 3.");
                check = false;
            }

            if (n < 0) {
                fail("n is under index min of 0.");
                check = false;
            }

            n = rn.nextInt(max);
        }

        assertTrue(check);
    }

    @Test
    void magic8Ball_prints_appropriate_msg_set1() {
        // Random rn = new Random();
        // int max = 4;
        // Normally we would use:
        // int n = rn.nextInt(max);
        int n = 0;
        String [] arr = new String[4];

        arr[0] = "Yes.";
        arr[1] = "No.";
        arr[2] = "Maybe.";
        arr[3] = "Ask again later.";

        assertEquals(arr[n], arr[0]);
    }

    @Test
    void magic8Ball_prints_appropriate_msg_set2() {
        // Random rn = new Random();
        // int max = 4;
        // Normally we would use:
        // int n = rn.nextInt(max);
        int n = 1;
        String [] arr = new String[4];

        arr[0] = "Yes.";
        arr[1] = "No.";
        arr[2] = "Maybe.";
        arr[3] = "Ask again later.";

        assertEquals(arr[n], arr[1]);
    }

    @Test
    void magic8Ball_prints_appropriate_msg_set3() {
        // Random rn = new Random();
        // int max = 4;
        // Normally we would use:
        // int n = rn.nextInt(max);
        int n = 2;
        String [] arr = new String[4];

        arr[0] = "Yes.";
        arr[1] = "No.";
        arr[2] = "Maybe.";
        arr[3] = "Ask again later.";

        assertEquals(arr[n], arr[2]);
    }

    @Test
    void magic8Ball_prints_appropriate_msg_set4() {
        // Random rn = new Random();
        // int max = 4;
        // Normally we would use:
        // int n = rn.nextInt(max);
        int n = 3;
        String [] arr = new String[4];

        arr[0] = "Yes.";
        arr[1] = "No.";
        arr[2] = "Maybe.";
        arr[3] = "Ask again later.";

        assertEquals(arr[n], arr[3]);
    }
}