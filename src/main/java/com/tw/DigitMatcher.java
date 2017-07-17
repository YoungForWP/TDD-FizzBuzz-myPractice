package com.tw;

public class DigitMatcher {

    private final String digit;
    private final String text;

    private DigitMatcher(String digit, String text) {
        this.digit = digit;
        this.text = text;
    }

    static DigitMatcher fizz() {
        return  new DigitMatcher("3", "Fizz");
    }

    public static DigitMatcher buzz() {
        return  new DigitMatcher("5", "Buzz");
    }

    public static DigitMatcher whizz() {
        return  new DigitMatcher("7", "Whizz");
    }

    boolean isMatched(String digit) {
        return digit.equals(this.digit);
    }

    String getText() {
        return text;
    }
}