package com.tw;

class DigitMatcher {

    private final String digit;
    private final String text;

    private DigitMatcher(String digit, String text) {
        this.digit = digit;
        this.text = text;
    }

    static DigitMatcher fizz() {
        return  new DigitMatcher("3", "Fizz");
    }

    static DigitMatcher buzz() {
        return  new DigitMatcher("5", "Buzz");
    }

    static DigitMatcher whizz() {
        return  new DigitMatcher("7", "Whizz");
    }

    boolean contains(String digit) {
        return digit.equals(this.digit);
    }

    String getText() {
        return text;
    }
}