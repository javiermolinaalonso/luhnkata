package com.phoboss.kata.luhn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jmolina on 24/3/17.
 */
public class TestCardNumberSum {

    private String input;
    private Luhn luhn;

    @Before
    public void setUp() throws Exception {
        input = "123456789";
        luhn = new Luhn();
    }

    @Test
    public void givenRandomCardNumberWhenSumOddPositionsThenCorrectSum() throws Exception {
        int result = luhn.sumOdd(input);

        assertEquals("Odd numbers sum", 25, result);
    }

    @Test
    public void givenRandomCardNumberWhenSumEvenPositionsThenExpectCorrectSum() throws Exception {
        int result = luhn.sumEven(input);

        assertEquals("Even numbers sum", 22, result);
    }

}
