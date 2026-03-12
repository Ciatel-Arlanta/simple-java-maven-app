package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App calculator = new App();

    @Test
    void testAdd() {
        // Existing test case
        assertEquals(10, calculator.add(5, 5));
        // New test cases
        assertEquals(0, calculator.add(0, 0));  // Add zeroes
        assertEquals(-5, calculator.add(-2, -3)); // Add negative numbers
        assertEquals(5, calculator.add(10, -5)); // Add positive and negative numbers
    }

    @Test
    void testMultiply() {
        // Existing test case
        assertEquals(25, calculator.multiply(5, 5));
        // New test cases
        assertEquals(0, calculator.multiply(5, 0));  // Multiply by zero
        assertEquals(-15, calculator.multiply(-3, 5)); // Multiply negative and positive
        assertEquals(6, calculator.multiply(-2, -3)); // Multiply two negatives
    }
}