package com.phoboss.kata.luhn;

import org.junit.Before;
import org.junit.Test;

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

        String cardNumber = "135743824834";

        boolean isCardNumberValid = cardNumberValidator.validate(cardNumber);

        assertTrue(isCardNumberValid);
    }
}
