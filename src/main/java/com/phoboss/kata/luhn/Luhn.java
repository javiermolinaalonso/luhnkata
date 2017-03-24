package com.phoboss.kata.luhn;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Function;

/**
 * Created by jmolina on 21/3/17.
 */
public class Luhn {

    private CardNumberValidator cardNumberValidator;

    public Luhn() {
        this(new CardNumberValidator());
    }

    public Luhn(CardNumberValidator cardNumberValidator) {
        this.cardNumberValidator = cardNumberValidator;
    }

    public String reverse(String input) {
        return StringUtils.reverse(input);
    }

    public int sumOdd(String input) {
        return computeLuhn(input, Function.identity(), 1, 0);
    }

    public int sumEven(String input) {
        return computeLuhn(input, x -> x > 9 ? x - 9 : x, 2, 1);
    }

    private int computeLuhn(String input, Function<Integer, Integer> function, Integer multiplier, Integer origin) {
        int result = 0;
        for (int i = origin; i < input.length(); i += 2) {
            int valueOf = function.apply(Integer.valueOf(input.substring(i, i + 1)) * multiplier);
            result += valueOf;
        }
        return result;
    }

    public boolean validate(String input) {
        boolean isInputValid = cardNumberValidator.validate(input);
        if (isInputValid) {
            String reverseInput = reverse(input);
            int result = sumEven(reverseInput) + sumOdd(reverseInput);
            return result % 10 == 0;
        } else {
            return false;
        }

    }
}
