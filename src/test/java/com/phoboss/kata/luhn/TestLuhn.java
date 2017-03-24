package com.phoboss.kata.luhn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
    public void testGivenCorrectCardNumberWhenLuhnExpectSuccess() throws Exception {
        String input = "5227190382720519";

        boolean luhnSuccess = luhn.validate(input);

        assertTrue("Luhn test is not working", luhnSuccess);
    }

    @Test
    public void testGivenInvalidCardNumberWhenLuhnExpectFailure() throws Exception {
        String input = "patatabullida";

        boolean luhnSuccess = luhn.validate(input);

        assertFalse("Luhn test is not working", luhnSuccess);
    }
}
