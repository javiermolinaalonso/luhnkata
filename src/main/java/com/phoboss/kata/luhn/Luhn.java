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

    public int sumEven(String input) {
        int result = 0;
        for (int i = 1; i < input.length(); i+=2){
            int valueOf = Integer.valueOf(input.substring(i, i+1))*2;
            if(valueOf > 9)
                valueOf = (valueOf - 10) + 1;

            result += valueOf;
        }

        return result;
    }
}
