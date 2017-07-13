package com.tw;

public class FizzBuzzMatcher {
    public FizzBuzzMatcher() {
    }

    boolean isMatchedFizzBuzz(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    String getText() {
        return "FizzBuzz";
    }
}