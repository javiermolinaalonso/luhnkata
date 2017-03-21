package com.phoboss.kata.luhn;

/**
 * Created by jmolina on 21/3/17.
 */
public class CardNumberValidator {

    public boolean validate(String cardNumber) {
        try{
            Long.parseLong(cardNumber);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
