package com.phoboss.kata.luhn;

/**
 * Created by jmolina on 21/3/17.
 */
public class CardNumberValidator {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public boolean validate(String cardNumber) {
        boolean result = true;
        try {
            Long.parseLong(cardNumber);
        } catch (NumberFormatException nfe) {
            result = false;
        }
        return result;
    }

}
