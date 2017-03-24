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

            Function f = new Function<Integer, Integer>() {
                @Override
                public Integer apply(Integer valueOf) {
                    return valueOf;
                }
            };

            int valueOf = getAnInt(input, i, 1, f);
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
            Function f = new Function<Integer, Integer>() {
                @Override
                public Integer apply(Integer valueOf) {
                    if (valueOf > 9)
                        return (valueOf - 10) + 1;
                    else
                        return valueOf;
                }
            };
            int valueOf = getAnInt(input, i, 2, f);
            result += valueOf;
        }

        return result;
    }
}
