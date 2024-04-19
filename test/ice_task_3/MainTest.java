/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ice_task_3;

import static ice_task_3.Main.greatest_common_divisor;
import static ice_task_3.Main.isValid;
import static ice_task_3.Main.odd_squares_sum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author uthac
 */
public class MainTest {
    
    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
    }

    public void testIsValid() {
        String case1 = "{}{)}";
        String case2 = "";
        String case3 = "{[}]";
        String case4 = "()";
        String case5 = "({[]})";

        assertFalse(isValid(case1)); // Expected output: false (invalid)
        assertFalse(isValid(case2));  // Expected output: true (valid)
        assertFalse(isValid(case3)); // Expected output: false (invalid)
        assertTrue(isValid(case4));  // Expected output: true (valid)
        assertTrue(isValid(case5));  // Expected output: true (valid)
    }

    @Test
    public void testOddSquaresSum() {
        int limit = 10;
        double expected = 285.0; // Expected sum of squares of odd numbers up to 10
        assertEquals(expected, odd_squares_sum(limit), 0.001);
    }

    @Test
    public void testGreatestCommonDivisor() {
        int a = 10;
        int b = 15;
        int expected = 5; // Expected GCD of 10 and 15
        assertEquals(expected, greatest_common_divisor(a, b));
    }
    
}
