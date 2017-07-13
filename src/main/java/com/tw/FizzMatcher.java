package com.tw;

public class FizzMatcher {
    public FizzMatcher() {
    }

    boolean isMatchedFizz(int number) {
        return number % 3 == 0;
    }

    String getText() {
        return "Fizz";
    }
}