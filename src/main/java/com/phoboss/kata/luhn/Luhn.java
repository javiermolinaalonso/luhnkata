package com.phoboss.kata.luhn;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Function;

/**
 * Created by jmolina on 21/3/17.
 */
public class Luhn {

    public String reverse(String input) {
        return StringUtils.reverse(input);
    }

    public int sumOdd(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i += 2) {
            int valueOf = getAnInt(input, i, 1, Function.identity());
            result += valueOf;
        }

        return result;
    }

    private int getAnInt(String input, int i, int multiplier, Function<Integer, Integer> f) {
        return f.apply(Integer.valueOf(input.substring(i, i + 1)) * multiplier);
    }

    public int sumEven(String input) {
        int result = 0;
        for (int i = 1; i < input.length(); i += 2) {
            int valueOf = getAnInt(input, i, 2, x -> x > 9 ? x - 9 : x);
            result += valueOf;
        }

        return result;
    }
}
