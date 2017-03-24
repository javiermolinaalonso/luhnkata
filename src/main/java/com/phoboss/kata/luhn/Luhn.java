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
        return getResult(input, Function.identity(), 1, 0);
    }

    public int sumEven(String input) {
        return getResult(input, x -> x > 9 ? x - 9 : x, 2, 1);
    }

    private int getResult(String input, Function<Integer, Integer> function, Integer multiplier, Integer origin) {
        int result = 0;
        for (int i = origin; i < input.length(); i += 2) {
            int valueOf = function.apply(Integer.valueOf(input.substring(i, i + 1)) * multiplier);
            result += valueOf;
        }
        return result;
    }
}
