package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        System.out.println(squareDigits("2"));
        System.out.println(squareDigits("a2b"));
        System.out.println(squareDigits("a22b"));
        System.out.println(squareDigits("a9b2"));
    }

    private static String squareDigits(String s) {
        return Arrays.stream(s.split("")).map(c -> {
            try {
                int n = Integer.parseInt(c);
                return String.valueOf(n * n);
            } catch (NumberFormatException e) {
                return c;
            }
        }).collect(Collectors.joining());
    }
}