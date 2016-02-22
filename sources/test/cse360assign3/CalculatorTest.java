package cse360assign3;

/*
 * Student: Anders Pitman
 * PIN: 705
 * Description: Assignment 3. Unit tests for Calculator
 */

import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testConstructor() {
        assertNotNull(calculator);
    }

    @Test
    public void testGetTotal() {
        assertEquals(0, calculator.getTotal());
    }

    @Test
    public void testAdd() {
        calculator.add(1);
        assertEquals(1, calculator.getTotal());
    }

    @Test
    public void testSubtract() {
        calculator.subtract(1);
        assertEquals(-1, calculator.getTotal());
    }

    @Test
    public void testMultiplyZero() {
        calculator.multiply(1);
        assertEquals(0, calculator.getTotal());

        calculator.add(1);
        calculator.multiply(0);
        assertEquals(0, calculator.getTotal());
    }

    @Test
    public void testMultiplyIdentity() {
        calculator.add(1);
        calculator.multiply(1);
        assertEquals(1, calculator.getTotal());

        calculator.add(9);
        calculator.multiply(10);
        assertEquals(100, calculator.getTotal());
    }

    @Test
    public void testDivideZero() {
        calculator.divide(0);
        assertEquals(0, calculator.getTotal());

        calculator.add(10);
        calculator.divide(0);
        assertEquals(0, calculator.getTotal());
    }

    @Test
    public void testDivideIdentity() {
        calculator.add(1);
        calculator.divide(1);
        assertEquals(1, calculator.getTotal());

        calculator.add(99);
        calculator.divide(10);
        assertEquals(10, calculator.getTotal());
    }

    @Test
    public void testGetHistory() {
        assertTrue(false);
    }
}
