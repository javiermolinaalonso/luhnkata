package com.phoboss.kata.luhn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jmolina on 21/3/17.
 */
public class TestLuhn {

    private Luhn luhn;

    @Before
    public void setUp() throws Exception {
        luhn = new Luhn();
    }

    @Test
    public void givenRandomCardNumberWhenReverseExpectReversed() throws Exception {
        String input = "Hello world!";

        String result = luhn.reverse(input);

        assertEquals("The reverse is not working", "!dlrow olleH", result);
    }

    @Test
    public void givenRandomCardNumberWhenSumOddPositionsThenCorrectSum() throws Exception {
        String input = "123456789";

        int result = luhn.sumOdd(input);

        assertEquals("Odd numbers sum", 25, result);

    }
}
