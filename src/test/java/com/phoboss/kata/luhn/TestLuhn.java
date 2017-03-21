package com.phoboss.kata.luhn;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jmolina on 21/3/17.
 */
public class TestLuhn {

    private CardNumberValidator cardNumberValidator;

    @Before
    public void setUp() throws Exception {

        cardNumberValidator = new CardNumberValidator();

    }

    @Test
    public void givenCardNumberWhenCheckInputExpectTrue() throws Exception {

        String cardNumber = "12000000000";

        boolean isCardNumberValid = cardNumberValidator.validate(cardNumber);

        assertTrue("The card number should be a number", isCardNumberValid);
    }

    @Test
    public void givenRandomTextWhenCheckInputExpectFalse() throws Exception {

        String cardNumber = "HolaTocateLaCola";

        boolean isCardNumberValid = cardNumberValidator.validate(cardNumber);

        assertFalse("The card number should be a number", isCardNumberValid);
    }
}
