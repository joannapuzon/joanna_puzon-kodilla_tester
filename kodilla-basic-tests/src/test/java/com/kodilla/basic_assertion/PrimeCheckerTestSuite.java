package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.PrimeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {

    private PrimeChecker checker = new PrimeChecker();

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        boolean result = checker.isPrime(14);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        boolean result = checker.isPrime(13);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(2);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        boolean result = checker.isPrime(1);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        boolean result = checker.isPrime(0);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        boolean result = checker.isPrime(-6);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertFalse(result);
    }
}
