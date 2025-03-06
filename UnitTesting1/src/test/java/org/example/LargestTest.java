package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LargestTest {

    @Test
    public void testLargest() {
        // Test Case 1
        int[] list1 = {7, 8, 9};
        assertEquals(9, Largest.largest(list1), "9 adalah terbesar");

        // Test Case 2
        int[] list2 = {9, 8, 7};
        assertEquals(9, Largest.largest(list2), "9 adalah terbesar");

        // Test Case 3
        int[] list3 = {7, 9, 7};
        assertEquals(9, Largest.largest(list3), "9 adalah terbesar");

        // Test Case 4
        int[] list4 = {7, 8, 9};
        assertEquals(9, Largest.largest(list4), "9 adalah terbesar");
    }
}
