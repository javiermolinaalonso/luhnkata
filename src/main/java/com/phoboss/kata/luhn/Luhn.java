package com.phoboss.kata.luhn;

/**
 * Created by jmolina on 21/3/17.
 */
public class Luhn {
    public String reverse(String input) {
        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }

        return output;
    }
}
