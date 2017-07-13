package com.tw;

public class FizzBuzzMatcher implements Matcher {
    public FizzBuzzMatcher() {
    }

    @Override
    public boolean isMatched(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    @Override
    public String getText() {
        return "FizzBuzz";
    }
}