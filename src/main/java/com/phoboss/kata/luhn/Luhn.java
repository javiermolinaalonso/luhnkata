package com.phoboss.kata.luhn;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by jmolina on 21/3/17.
 */
public class Luhn {

    public String reverse(String input) {
        return StringUtils.reverse(input);
    }

    public int sumOdd(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i+=2) {
            result += Integer.valueOf(input.substring(i, i+1));
        }

        return result;
    }
}
