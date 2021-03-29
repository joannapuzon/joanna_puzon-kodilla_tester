package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 4;
        int subtractResult = calculator.subtract(a,b);
        assertEquals(4, subtractResult);
    }

    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        double a = 3;
        double b = 2;
        double powResult = calculator.pow(a);
        assertEquals(9,powResult);
    }
}