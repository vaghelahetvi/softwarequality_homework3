package com.hetvi.Homework3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    // Test Case 1: `toFind` present multiple times
    @Test
    public void testCharOccurrencesMultipleTimes() {
        char[] testData = { 'a', 'b', 'a' };
        char toFind = 'a';
        int expectedOccurrences = 2;
        assertEquals(expectedOccurrences, App.countChar(testData, toFind),
                "Count should match the number of times 'toFind' is present in the array.");
    }

    // Test Case 2: `toFind` not present
    @Test
    public void testCharNotPresent() {
        char[] testData = { 'a', 'b', 'c' };
        char toFind = 'd';
        int expectedOccurrences = 0;
        assertEquals(expectedOccurrences, App.countChar(testData, toFind),
                "Count should be zero when 'toFind' is not present in the array.");
    }

    // Test Case 3: Empty array
    @Test
    public void testEmptyArray() {
        char[] testData = {};
        char toFind = 'a';
        int expectedOccurrences = 0;
        assertEquals(expectedOccurrences, App.countChar(testData, toFind),
                "Count should be zero when the array is empty.");
    }

    // Test Case 4: `toFind` present once
    @Test
    public void testCharOccurrencesOnce() {
        char[] testData = { 'a', 'b', 'c' };
        char toFind = 'a';
        int expectedOccurrences = 1;
        assertEquals(expectedOccurrences, App.countChar(testData, toFind),
                "Count should match the number of times 'toFind' is present in the array.");
    }

    // Test Case 5: Array without `toFind`
    @Test
    public void testArrayWithoutChar() {
        char[] testData = { 'b', 'c', 'd' };
        char toFind = 'a';
        int expectedOccurrences = 0;
        assertEquals(expectedOccurrences, App.countChar(testData, toFind),
                "Count should be zero when 'toFind' is not present in the array.");
    }
}
