package com.phoboss.kata.luhn;

/**
 * Created by jmolina on 21/3/17.
 */
public class CardNumberValidator {

    @SuppressWarnings("ResultOfMethodCallIgnored")
    public boolean validate(String cardNumber) {
        String regex = "\\d+";
        return cardNumber.matches(regex);
    }

}
